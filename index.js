let money = 5000
let card = []
document.getElementById('money').innerHTML=money;

function startGame (){
    var playerBet = document.getElementById('setYourBet').value
    if (!playerBet) {
        alert('set your bet first') 
    } else if (playerBet > money ) {
        alert('your money less than your bet')
        return;
    }else{
        money = money - playerBet
        document.getElementById('money').innerHTML=money
    }
    card.push(getRndInteger(1, 11))
    card.push(getRndInteger(1, 11))
    message.innerHTML = 'Draw a New Card?'
    document.getElementById('card').innerHTML=card
    document.getElementById('sum').innerHTML=sumCard(card)
    document.getElementById('start').innerHTML='Want to Play Again?'
}

function takeCard() {
    card.push(getRndInteger(1, 11))
    document.getElementById('card').innerHTML=card
    document.getElementById("sum").innerHTML=sumCard(card)
    if (sumCard (card) === 21) {
        document.getElementById('take').disabled=true
        message.innerHTML='Congrats!'
        var bet = document.getElementById('setYourBet').value
        money += bet * 5
        money.innerHTML = money
        // return;
    } else if (sumCard (card) > 21) {
        document.getElementById('take').disabled=true
        message.innerHTML='You Lose!'
        return;
    }   
}

function resetMoney () {
    location.reload ();
}
function getRndInteger(min, max) {
    return Math.floor(Math.random() * (max - min) ) + min;
}
function sumCard (card) {
    return (sum = card.reduce((partialSum, a) => partialSum + a, 0));
}