package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfy {
    public CharSequence a;
    public final float b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public int g;
    public float h;

    public bfy() {
        this.a = null;
        this.b = -3.4028235E38f;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = -3.4028235E38f;
    }

    public final bfz a() {
        return new bfz(this.a, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, this.g, this.h);
    }

    public bfy(bfz bfzVar) {
        this.a = bfzVar.a;
        this.b = -3.4028235E38f;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
        this.g = bfzVar.m;
        this.h = bfzVar.n;
    }
}
