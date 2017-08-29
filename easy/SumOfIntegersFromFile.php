<?php

$fh = fopen($argv[1], "r");
while (true) {
$test = fgets($fh);
if($test==''){
    break;
}
$temp +=$test;

# break loop if $test is an empty line
# $test represents the test case, do something with it
}
print_r($temp);
?>
