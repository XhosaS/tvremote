package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbi extends yiz implements yjz {
    /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbi(yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((dbi) create((dcq) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((dbi) create((bcu) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((dbi) create((fus) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 3) {
            return ((dbi) create((yus) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((dbi) create((ihz) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.b;
        if (i == 0) {
            dbi dbiVar = new dbi(yihVar, 0);
            dbiVar.a = obj;
            return dbiVar;
        }
        if (i == 1) {
            dbi dbiVar2 = new dbi(yihVar, 1, (byte[]) null);
            dbiVar2.a = obj;
            return dbiVar2;
        }
        if (i == 2) {
            dbi dbiVar3 = new dbi(yihVar, 2, (char[]) null);
            dbiVar3.a = obj;
            return dbiVar3;
        }
        if (i != 3) {
            dbi dbiVar4 = new dbi(yihVar, 4, (int[]) null);
            dbiVar4.a = obj;
            return dbiVar4;
        }
        dbi dbiVar5 = new dbi(yihVar, 3, (short[]) null);
        dbiVar5.a = obj;
        return dbiVar5;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        if (i == 0) {
            ybn.f(obj);
            return Boolean.valueOf(!(((dcq) this.a) instanceof dcj));
        }
        if (i == 1) {
            ybn.f(obj);
            return Boolean.valueOf(((bcu) this.a) == bcu.a);
        }
        if (i != 2) {
            if (i != 3) {
                ybn.f(obj);
                return Boolean.valueOf(((yus) this.a) != yus.a);
            }
            ybn.f(obj);
            return Boolean.valueOf(!(((ihz) this.a) instanceof ihx));
        }
        ybn.f(obj);
        fus fusVar = (fus) this.a;
        if (fus.v(2)) {
            Objects.toString(fusVar);
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbi(yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbi(yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbi(yih yihVar, int i, int[] iArr) {
        super(2, yihVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbi(yih yihVar, int i, short[] sArr) {
        super(2, yihVar);
        this.b = i;
    }
}
