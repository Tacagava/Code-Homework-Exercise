const Node = require('./Node');
let node1 = new Node(10);

let node2 = new Node(20);

let node3 = new Node(30);

let node4 = new Node(40);

node1.next = node2;
node2.next = node3;
node3.next = node4;

function printNodeValues(head)  {
    let str = "";
    while(head !== null) {
        str = str + head.val + " -- > ";
        // Move node myself
        head = head.next;
    }
    console.log(str);
}

printNodeValues(node1);