package com.chargebee.models;

import com.chargebee.*;
import com.chargebee.internal.*;
import com.chargebee.internal.HttpUtil.Method;
import com.chargebee.models.enums.*;
import org.json.*;
import java.io.*;
import java.sql.Timestamp;
import java.util.*;

public class CreditNoteEstimate extends Resource<CreditNoteEstimate> {

    public static class LineItem extends Resource<LineItem> {
        public enum EntityType {
             PLAN_SETUP,PLAN,ADDON,ADHOC,
            _UNKNOWN; /*Indicates unexpected value for this enum. You can get this when there is a
            java-client version incompatibility. We suggest you to upgrade to the latest version */ 
        }

        public LineItem(JSONObject jsonObj) {
            super(jsonObj);
        }

        public Timestamp dateFrom() {
            return reqTimestamp("date_from");
        }

        public Timestamp dateTo() {
            return reqTimestamp("date_to");
        }

        public Integer unitAmount() {
            return reqInteger("unit_amount");
        }

        public Integer quantity() {
            return optInteger("quantity");
        }

        public Integer taxAmount() {
            return optInteger("tax_amount");
        }

        public Double taxRate() {
            return optDouble("tax_rate");
        }

        public Integer lineAmount() {
            return reqInteger("line_amount");
        }

        public Integer discountAmount() {
            return optInteger("discount_amount");
        }

        public String description() {
            return reqString("description");
        }

        public EntityType entityType() {
            return reqEnum("entity_type", EntityType.class);
        }

        public String entityId() {
            return optString("entity_id");
        }

    }

    public static class Discount extends Resource<Discount> {
        public enum Type {
             COUPON,CREDIT_ADJUSTMENT,ACCOUNT_CREDITS,
            _UNKNOWN; /*Indicates unexpected value for this enum. You can get this when there is a
            java-client version incompatibility. We suggest you to upgrade to the latest version */ 
        }

        public Discount(JSONObject jsonObj) {
            super(jsonObj);
        }

        public Integer amount() {
            return reqInteger("amount");
        }

        public String description() {
            return optString("description");
        }

        public EntityType entityType() {
            return reqEnum("entity_type", EntityType.class);
        }

        public String entityId() {
            return optString("entity_id");
        }

    }

    public static class Tax extends Resource<Tax> {
        public Tax(JSONObject jsonObj) {
            super(jsonObj);
        }

        public Integer amount() {
            return reqInteger("amount");
        }

        public String description() {
            return optString("description");
        }

    }

    //Constructors
    //============

    public CreditNoteEstimate(String jsonStr) {
        super(jsonStr);
    }

    public CreditNoteEstimate(JSONObject jsonObj) {
        super(jsonObj);
    }

    // Fields
    //=======

    public String referenceInvoiceId() {
        return reqString("reference_invoice_id");
    }

    public Type type() {
        return reqEnum("type", Type.class);
    }

    public Integer subTotal() {
        return reqInteger("sub_total");
    }

    public Integer total() {
        return reqInteger("total");
    }

    public Integer creditsAllocated() {
        return reqInteger("credits_allocated");
    }

    public Integer remainingCredits() {
        return reqInteger("remaining_credits");
    }

    public List<CreditNoteEstimate.LineItem> lineItems() {
        return optList("line_items", CreditNoteEstimate.LineItem.class);
    }

    public List<CreditNoteEstimate.Discount> discounts() {
        return optList("discounts", CreditNoteEstimate.Discount.class);
    }

    public List<CreditNoteEstimate.Tax> taxes() {
        return optList("taxes", CreditNoteEstimate.Tax.class);
    }

    // Operations
    //===========


}
