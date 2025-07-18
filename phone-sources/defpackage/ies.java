package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ies {
    private static final String[] a = new String[0];
    private String[] b;
    private String c;
    private boolean d;

    public ies() {
        new ContentValues();
        this.b = a;
        this.d = false;
        this.c = "";
    }

    public final Object a() {
        a.ah(!this.d, "Sql compiler cannot be reused");
        this.d = true;
        return new ier(this.b, this.c);
    }

    public final void b(String... strArr) {
        a.ah(!this.d, "Sql compiler cannot be reused");
        this.b = (String[]) strArr.clone();
    }

    public final void c(String str) {
        a.ah(!this.d, "Sql compiler cannot be reused");
        this.c = str;
    }
}
