package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bpu {
    public static final void a(we weVar, agux aguxVar) {
        we weVar2 = new we(999);
        int i = weVar.d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            weVar2.put(weVar.e(i2), weVar.h(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                aguxVar.a(weVar2);
                weVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            aguxVar.a(weVar2);
        }
    }
}
