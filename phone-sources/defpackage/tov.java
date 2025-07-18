package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tov {
    public tou b;
    public boolean d;
    public boolean e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final int[] j;
    public final zft k;
    public tow c = tow.NONE;
    public final tot a = new tot(this);

    public tov(zft zftVar, float f, float f2, float f3, int i, int i2, int i3, int i4) {
        this.k = zftVar;
        this.f = i;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = new int[]{i2, i3, i4};
    }

    public final void a() {
        this.a.removeCallbacksAndMessages(null);
        this.c = tow.NONE;
        this.b = null;
        this.e = false;
    }

    public final void b(tou touVar) {
        this.b = touVar;
        tot totVar = this.a;
        if (totVar.hasMessages(1)) {
            return;
        }
        totVar.sendMessage(totVar.a());
    }
}
