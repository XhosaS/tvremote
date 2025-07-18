package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahta {
    public static final /* synthetic */ ahrs a(ahrq ahrqVar) {
        abxd abxdVarV = ahrqVar.v();
        abxdVarV.getClass();
        return (ahrs) abxdVarV;
    }

    public static final void b(String str, ahrq ahrqVar) {
        str.getClass();
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar = (ahrs) ahrqVar.b;
        abxk abxkVar = ahrs.a;
        ahrsVar.e |= 4;
        ahrsVar.k = str;
    }

    public static final void c(String str, ahrq ahrqVar) {
        str.getClass();
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar = (ahrs) ahrqVar.b;
        abxk abxkVar = ahrs.a;
        ahrsVar.e |= 2;
        ahrsVar.i = str;
    }

    public static final /* synthetic */ void d(ybv ybvVar, ahrq ahrqVar) {
        ybvVar.getClass();
        if ((ahrqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ahrqVar.y();
        }
        ahrs ahrsVar = (ahrs) ahrqVar.b;
        abxk abxkVar = ahrs.a;
        abxj abxjVar = ahrsVar.j;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            ahrsVar.j = abxjVar.d(size + size);
        }
        ahrsVar.j.h(ybvVar.d);
    }

    public static final /* synthetic */ void e(ahrq ahrqVar) {
        new abxl(((ahrs) ahrqVar.b).j, ahrs.a);
    }
}
