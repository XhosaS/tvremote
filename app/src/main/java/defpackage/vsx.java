package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsx {
    public final Cursor a;

    public static final String a(Cursor cursor, int i) {
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    public static final byte[] b(Cursor cursor, int i) {
        byte[] blob = cursor.getBlob(i);
        blob.getClass();
        return blob;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vsx) && agvy.c(this.a, ((vsx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReadOnlyCursor(cursor=" + this.a + ")";
    }
}
