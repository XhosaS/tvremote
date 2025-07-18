package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqk {
    public static final xhe a;

    static {
        xhe xheVar = xhe.a;
        xhb xhbVar = new xhb();
        xjv xjvVar = xjv.a;
        xjs xjsVar = new xjs();
        xnw.b(xju.OK, xjsVar);
        xjv xjvVarA = xnw.a(xjsVar);
        if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xhbVar.y();
        }
        xhe xheVar2 = (xhe) xhbVar.b;
        xheVar2.c = xjvVarA;
        xheVar2.b |= 1;
        a = xkn.a(xhbVar);
    }

    public static final xhe a(xju xjuVar, String str) {
        xjuVar.getClass();
        xhe xheVar = xhe.a;
        xhb xhbVar = new xhb();
        xjv xjvVar = xjv.a;
        xjs xjsVar = new xjs();
        xnw.b(xjuVar, xjsVar);
        if ((xjsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjsVar.y();
        }
        xjv xjvVar2 = (xjv) xjsVar.b;
        xjvVar2.b |= 2;
        xjvVar2.d = str;
        xjv xjvVarA = xnw.a(xjsVar);
        if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xhbVar.y();
        }
        xhe xheVar2 = (xhe) xhbVar.b;
        xheVar2.c = xjvVarA;
        xheVar2.b |= 1;
        return xkn.a(xhbVar);
    }
}
