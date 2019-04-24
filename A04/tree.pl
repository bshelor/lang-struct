%%%%%%%%%%%%%%%%%%%%%%%%%%
% tree.pl
% https://gfx.cse.taylor.edu/courses/cos382/assignments/04_ParadigmLogic_Prolog
% The goal of this assignment is to write a collection of Prolog rules
% to represent and manipulate binary trees.
%%%%%%%%%%%%%%%%%%%%%%%%%%


%%%%%%%%%%%%%%%%%%%%%%%%%%
% Starter code

% tree(Tree)
% "Tree" is a binary tree.

tree(void).
tree(tree(_,Left,Right)) :-  tree(Left),
                             tree(Right).


% tree_member(Element,Tree)
% "Element" is an element of the binary tree "Tree".

tree_member(X,tree(X,_,_)).
tree_member(X,tree(_,Left,_)) :- tree_member(X,Left).
tree_member(X,tree(_,_,Right)) :- tree_member(X,Right).



% preorder(Tree,Pre)
% "Pre" is a list of elements of "Tree" accumulated during a
% preorder traversal.

preorder(tree(X,L,R),Xs) :- preorder(L,Ls), preorder(R,Rs),
                            append([X|Ls],Rs,Xs).
preorder(void,[]).



% append(Xs,Ys,XsYs)
% "XsYs" is the result of appending the lists "Xs" and "Ys".

append([],Ys,Ys).
append([X|Xs],Ys,[X|Zs]) :- append(Xs,Ys,Zs).


% Some sample trees
%
%    tree1       tree2         tree3
%
%      1           4             1
%     / \         / \           / \
%    2   3       5   6         2   3
%                             / \
%                            5   6
%                               /
%                              7
%

tree1(tree(1,tree(2,void,void),tree(3,void,void))).
tree2(tree(4,tree(5,void,void),tree(6,void,void))).
tree3(
        tree(   1,
                tree(   2,
                        tree(5,void,void),
                        tree(   6,
                                tree(7,void,void),
                                void
                        )
                ),
                tree(3,void,void)
        )
).



%%%%%%%%%%%%%%%%%%%%%%%%%%
% Place your code here


% Additional test data
tree4(
        tree( 6,
              tree( 3,
                     tree( 8, void, void),
                     tree( 7, void, void)
                   ),
              tree(3,void,void)
        )
).

tree5(
        tree(   3,
                tree(   5,
                        tree(   9,
                                tree(7,void,void),
                                tree(9,void,void)
                        ),
                        tree(   4,
                                tree(5,void,void),
                                tree(9,void,void)
                        )
                ),
                tree(   4,
                        tree(   8,
                                tree(6,void,void),
                                tree(4,void,void)
                        ),
                        tree(   7,
                                tree(8,void,void),
                                tree(3,void,void)
                        )
                )
        )
).
                
% inorder
inorder(void, []).
inorder(tree(X,L,R),Xs) :- inorder(L,Ls), inorder(R,Rs), append(Ls,[X|Rs],Xs).

% search
search(tree(Key,_,_), Key).
search(tree(_,Left,_), Key) :- search(Left, Key).
search(tree(_,_,Right), Key) :- search(Right, Key).

% subtree
subtree(T,T).
subtree(T, tree(_,L,_)) :- subtree(T,L).
subtree(T, tree(_,_,R)) :- subtree(T,R).

% sumtree
sumtree(void, 0).
sumtree(tree(X,L,R), S) :- sumtree(L, SumLeft), sumtree(R, SumRight), S is X+SumLeft+SumRight.

% ordered
% tree(10, tree(3, tree(2, void, void), tree(4, void, void)), tree(11, void, tree(17, void, void)))
bigger(_, void).
bigger(X, tree(N,L,R)) :- X>N, bigger(X,L), bigger(X,R).

smaller(_, void).
smaller(X, tree(N,L,R)) :- X<N, smaller(X,R), smaller(X,L).

ordered(void).
ordered(tree(X,L,R)) :- bigger(X,L), smaller(X,R), ordered(L), ordered(R).

% substitute



