package com.example.expensestracking;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class MongoDBOpertations {
    public static void insertDocument(MongoDatabase database, String collectionName, Document document) {
        MongoCollection<Document> collection= database.getCollection(collectionName);
    collection.insertOne(document) ;
    }
}
