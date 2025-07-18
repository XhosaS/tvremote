package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hte {
    public final float a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("suggest_rating_score");
        if (columnIndex >= 0) {
            return cursor.getFloat(columnIndex);
        }
        return 0.0f;
    }

    public final int b(Cursor cursor, String str, int i) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getInt(columnIndex) : i;
    }

    public final boolean c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("suggest_rating_score");
        return columnIndex >= 0 && cursor.getInt(columnIndex) != 0;
    }
}
