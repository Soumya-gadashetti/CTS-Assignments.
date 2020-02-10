class Fruit{
    constructor(title,price){
        this.title=title;
        this.price=price;
    }
    estimateFor(quantity){
        return quantity*this.price;
    }
    discountedEstimateFor(quantity,discPercent){
        let estimate=this.estimateFor(quantity);
        return estimate*discPercent/100;
    }

    static getShopTitle(){
        return "Shri Laxmi Fruit Mart"
    }
}

console.log(Fruit.getShopTitle());

f1=new Fruit("Apple",20);
console.log(f1);
console.log(f1.estimateFor(50));
console.log(f1.discountedEstimateFor(50,25));