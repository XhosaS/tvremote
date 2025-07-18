package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sei {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;

    public sei(int i, int i2, int i3, int i4, Boolean bool) {
        this.d = i;
        this.c = i2;
        this.b = i3;
        this.a = i4;
        this.e = bool;
    }

    public final boolean a() {
        int i = this.b;
        if (i == 2 || i == 3) {
            return false;
        }
        int i2 = this.a;
        return i2 == 3 || i2 == 4;
    }

    public final boolean b() {
        if (!a()) {
            return false;
        }
        int i = this.d;
        return i == 2 || i == 3;
    }

    public final boolean c() {
        return a() && this.d != 1;
    }

    public final boolean d() {
        Object obj = this.e;
        return obj != null ? b() && ((Boolean) obj).booleanValue() : this.d == 3;
    }

    public sei(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        this.e = viewHolder;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public sei(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4, byte[] bArr) {
        this.e = viewHolder;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
