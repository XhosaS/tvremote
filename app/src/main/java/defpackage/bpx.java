package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bpx {
    public static final int a(brj brjVar, String str) {
        int iA = bpw.a(brjVar, str);
        if (iA >= 0) {
            return iA;
        }
        int iA2 = bpw.a(brjVar, "`" + str + '`');
        if (iA2 >= 0) {
            return iA2;
        }
        return -1;
    }
}
