package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbw extends yiz implements yjz {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbw(yih yihVar, int i) {
        super(2, yihVar);
        this.a = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            return new cbw((yih) obj2, 0).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return new cbw((yih) obj2, 1, (byte[]) null).invokeSuspend(ygi.a);
        }
        if (i != 2) {
            return new cbw((yih) obj2, 3, (short[]) null).invokeSuspend(ygi.a);
        }
        return new cbw((yih) obj2, 2, (char[]) null).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? new cbw(yihVar, 3, (short[]) null) : new cbw(yihVar, 2, (char[]) null) : new cbw(yihVar, 1, (byte[]) null) : new cbw(yihVar, 0);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            ybn.f(obj);
            return Choreographer.getInstance();
        }
        if (i == 1) {
            ybn.f(obj);
            return ygi.a;
        }
        if (i != 2) {
            ybn.f(obj);
            return yvd.a(ibk.a);
        }
        ybn.f(obj);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbw(yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbw(yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbw(yih yihVar, int i, short[] sArr) {
        super(2, yihVar);
        this.a = i;
    }
}
