
## Valid references
# John
# 1 John 1:2-4
# Ps 12:1,3-4
# Rev 2:4;4:3-6
# 9 Matthew 77:190-314
 
my $filename = "$ARGV[0]";
open(my $fh, '<:encoding(UTF-8)', $filename)
  or die "Could not open file '$filename' $!";
 
while (my $row = <$fh>) {
  chomp $row;
  if ($row =~ /^[A-Za-z]+$/) {
      print "Matched ->";
      print "$row -- True\n";
  } elsif ($row =~ /^[A-Za-z]+\s\d+$/) {
      print "Matched ->";
      print "$row -- True\n";
  } elsif ($row =~ /(\d+\s[A-Za-z^\s]+\s|[A-Za-z^\s]+\s)\d+:(\d+|\d+,\d+|\d+-\d+)[-,;]*(\d+|\d+,\d+|\d+-\d+)*/) {
      print "Matched ->";      
      print "$row -- True\n";
  }
  else {
      print "No match ->";
      print "$row -- False\n";
  }
}

