var bold_Items;

window.onload = function() {
    getBold_items();
};

function getBold_items() {
    bold_Items = document.getElementsByTagName('b');
}

function highlight() {
    for (var i = 0; i < bold_Items.length; i++) {                                                    
        bold_Items[i].style.color = "green";
    }
}


function return_normal()
{
  for (var i=0; i<bold_Items.length; i++) 
  {
       bold_Items[i].style.color = "black";
  }
}