export class Product {
  private timestamp: String | undefined;

  private name: String | undefined;

  private description: String | undefined;

  private productImages: any;

  private imagePath: String;

  private price: number | undefined;

  private inStock: boolean | undefined;




  constructor(
    timestamp: String , 
    name: String , 
    description: String , 
    productImages: any, 
    imagePath: String, 
    price: number , 
    inStock: boolean 
) {
    this.timestamp = timestamp
    this.name = name
    this.description = description
    this.productImages = productImages
    this.imagePath = imagePath
    this.price = price
    this.inStock = inStock
  }
  
}
