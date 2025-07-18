package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmr extends zix {
    private final zmq[] a;

    public zmr(zmq zmqVar) {
        this.a = new zmq[]{zmqVar};
    }

    public static zmr a(Object obj) {
        if (obj != null) {
            return new zmr(zjm.j(obj));
        }
        return null;
    }

    public static zmr c(zjr zjrVar) {
        return new zmr(zjm.m(zjrVar, false));
    }

    public final zmq[] b() {
        zmq[] zmqVarArr = this.a;
        int length = zmqVarArr.length;
        zmq[] zmqVarArr2 = new zmq[length];
        System.arraycopy(zmqVarArr, 0, zmqVarArr2, 0, length);
        return zmqVarArr2;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return new zkq(this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
        String str = zxr.a;
        stringBuffer.append(str);
        int i = 0;
        while (true) {
            zmq[] zmqVarArr = this.a;
            if (i == zmqVarArr.length) {
                return stringBuffer.toString();
            }
            stringBuffer.append("    ");
            stringBuffer.append(zmqVarArr[i]);
            stringBuffer.append(str);
            i++;
        }
    }

    private zmr(zjm zjmVar) {
        this.a = new zmq[zjmVar.b()];
        for (int i = 0; i != zjmVar.b(); i++) {
            this.a[i] = zmq.a(zjmVar.h(i));
        }
    }
}
