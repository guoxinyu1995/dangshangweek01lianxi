package com.example.guoxinyu.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.guoxinyu.bean.GreenDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GREEN_DAO".
*/
public class GreenDaoDao extends AbstractDao<GreenDao, Long> {

    public static final String TABLENAME = "GREEN_DAO";

    /**
     * Properties of entity GreenDao.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Pid = new Property(0, long.class, "pid", true, "_id");
        public final static Property BargainPrice = new Property(1, double.class, "bargainPrice", false, "BARGAIN_PRICE");
        public final static Property Createtime = new Property(2, String.class, "createtime", false, "CREATETIME");
        public final static Property DetailUrl = new Property(3, String.class, "detailUrl", false, "DETAIL_URL");
        public final static Property Images = new Property(4, String.class, "images", false, "IMAGES");
        public final static Property Itemtype = new Property(5, int.class, "itemtype", false, "ITEMTYPE");
        public final static Property Price = new Property(6, double.class, "price", false, "PRICE");
        public final static Property Pscid = new Property(7, int.class, "pscid", false, "PSCID");
        public final static Property Salenum = new Property(8, int.class, "salenum", false, "SALENUM");
        public final static Property Sellerid = new Property(9, int.class, "sellerid", false, "SELLERID");
        public final static Property Subhead = new Property(10, String.class, "subhead", false, "SUBHEAD");
        public final static Property Title = new Property(11, String.class, "title", false, "TITLE");
    }


    public GreenDaoDao(DaoConfig config) {
        super(config);
    }
    
    public GreenDaoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GREEN_DAO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: pid
                "\"BARGAIN_PRICE\" REAL NOT NULL ," + // 1: bargainPrice
                "\"CREATETIME\" TEXT," + // 2: createtime
                "\"DETAIL_URL\" TEXT," + // 3: detailUrl
                "\"IMAGES\" TEXT," + // 4: images
                "\"ITEMTYPE\" INTEGER NOT NULL ," + // 5: itemtype
                "\"PRICE\" REAL NOT NULL ," + // 6: price
                "\"PSCID\" INTEGER NOT NULL ," + // 7: pscid
                "\"SALENUM\" INTEGER NOT NULL ," + // 8: salenum
                "\"SELLERID\" INTEGER NOT NULL ," + // 9: sellerid
                "\"SUBHEAD\" TEXT," + // 10: subhead
                "\"TITLE\" TEXT);"); // 11: title
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GREEN_DAO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GreenDao entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getPid());
        stmt.bindDouble(2, entity.getBargainPrice());
 
        String createtime = entity.getCreatetime();
        if (createtime != null) {
            stmt.bindString(3, createtime);
        }
 
        String detailUrl = entity.getDetailUrl();
        if (detailUrl != null) {
            stmt.bindString(4, detailUrl);
        }
 
        String images = entity.getImages();
        if (images != null) {
            stmt.bindString(5, images);
        }
        stmt.bindLong(6, entity.getItemtype());
        stmt.bindDouble(7, entity.getPrice());
        stmt.bindLong(8, entity.getPscid());
        stmt.bindLong(9, entity.getSalenum());
        stmt.bindLong(10, entity.getSellerid());
 
        String subhead = entity.getSubhead();
        if (subhead != null) {
            stmt.bindString(11, subhead);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(12, title);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GreenDao entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getPid());
        stmt.bindDouble(2, entity.getBargainPrice());
 
        String createtime = entity.getCreatetime();
        if (createtime != null) {
            stmt.bindString(3, createtime);
        }
 
        String detailUrl = entity.getDetailUrl();
        if (detailUrl != null) {
            stmt.bindString(4, detailUrl);
        }
 
        String images = entity.getImages();
        if (images != null) {
            stmt.bindString(5, images);
        }
        stmt.bindLong(6, entity.getItemtype());
        stmt.bindDouble(7, entity.getPrice());
        stmt.bindLong(8, entity.getPscid());
        stmt.bindLong(9, entity.getSalenum());
        stmt.bindLong(10, entity.getSellerid());
 
        String subhead = entity.getSubhead();
        if (subhead != null) {
            stmt.bindString(11, subhead);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(12, title);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public GreenDao readEntity(Cursor cursor, int offset) {
        GreenDao entity = new GreenDao( //
            cursor.getLong(offset + 0), // pid
            cursor.getDouble(offset + 1), // bargainPrice
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // createtime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // detailUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // images
            cursor.getInt(offset + 5), // itemtype
            cursor.getDouble(offset + 6), // price
            cursor.getInt(offset + 7), // pscid
            cursor.getInt(offset + 8), // salenum
            cursor.getInt(offset + 9), // sellerid
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // subhead
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // title
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GreenDao entity, int offset) {
        entity.setPid(cursor.getLong(offset + 0));
        entity.setBargainPrice(cursor.getDouble(offset + 1));
        entity.setCreatetime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDetailUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImages(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setItemtype(cursor.getInt(offset + 5));
        entity.setPrice(cursor.getDouble(offset + 6));
        entity.setPscid(cursor.getInt(offset + 7));
        entity.setSalenum(cursor.getInt(offset + 8));
        entity.setSellerid(cursor.getInt(offset + 9));
        entity.setSubhead(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTitle(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(GreenDao entity, long rowId) {
        entity.setPid(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(GreenDao entity) {
        if(entity != null) {
            return entity.getPid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GreenDao entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
