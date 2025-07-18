package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yig implements Serializable, yil {
    private final yil a;
    private final yij b;

    public yig(yil yilVar, yij yijVar) {
        yilVar.getClass();
        this.a = yilVar;
        this.b = yijVar;
    }

    private final int a() {
        int i = 2;
        yig yigVar = this;
        while (true) {
            yil yilVar = yigVar.a;
            yigVar = yilVar instanceof yig ? (yig) yilVar : null;
            if (yigVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(yij yijVar) {
        return yks.e(get(yijVar.getKey()), yijVar);
    }

    private final Object writeReplace() {
        int iA = a();
        yil[] yilVarArr = new yil[iA];
        yld yldVar = new yld();
        fold(ygi.a, new aaw(yilVarArr, yldVar, 10));
        if (yldVar.a == iA) {
            return new yif(yilVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yig) {
            yig yigVar = (yig) obj;
            if (yigVar.a() == a()) {
                yig yigVar2 = this;
                while (true) {
                    if (!yigVar.b(yigVar2.b)) {
                        break;
                    }
                    yil yilVar = yigVar2.a;
                    if (yilVar instanceof yig) {
                        yigVar2 = (yig) yilVar;
                    } else if (yigVar.b((yij) yilVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) yjzVar.a(this.a.fold(r, yjzVar), this.b);
    }

    @Override // defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        yikVar.getClass();
        yig yigVar = this;
        while (true) {
            E e = (E) yigVar.b.get(yikVar);
            if (e != null) {
                return e;
            }
            yil yilVar = yigVar.a;
            if (!(yilVar instanceof yig)) {
                return (E) yilVar.get(yikVar);
            }
            yigVar = (yig) yilVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        yikVar.getClass();
        yij yijVar = this.b;
        if (yijVar.get(yikVar) != null) {
            return this.a;
        }
        yil yilVar = this.a;
        yil yilVarMinusKey = yilVar.minusKey(yikVar);
        return yilVarMinusKey != yilVar ? yilVarMinusKey == yim.a ? yijVar : new yig(yilVarMinusKey, yijVar) : this;
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return wcq.X(this, yilVar);
    }

    public final String toString() {
        return "[" + fold("", new dsc(13)) + "]";
    }
}
