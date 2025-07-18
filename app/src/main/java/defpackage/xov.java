package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xov {
    public final xgm a;

    public xov(xgm xgmVar) {
        this.a = xgmVar;
    }

    public final /* synthetic */ xgn a() {
        abxd abxdVarV = this.a.v();
        abxdVarV.getClass();
        return (xgn) abxdVarV;
    }

    public final /* synthetic */ acaw b() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((xgn) this.a.b).h);
        listUnmodifiableList.getClass();
        return new acaw(listUnmodifiableList);
    }

    public final /* synthetic */ void c(acaw acawVar, Iterable iterable) {
        acawVar.getClass();
        iterable.getClass();
        xgm xgmVar = this.a;
        if ((xgmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xgmVar.y();
        }
        xgn xgnVar = (xgn) xgmVar.b;
        xgn xgnVar2 = xgn.a;
        abxs abxsVar = xgnVar.h;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xgnVar.h = abxsVar.d(size + size);
        }
        abus.m(iterable, xgnVar.h);
    }

    public final void d(xfy xfyVar) {
        xfyVar.getClass();
        xgm xgmVar = this.a;
        if ((xgmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xgmVar.y();
        }
        xgn xgnVar = (xgn) xgmVar.b;
        xgn xgnVar2 = xgn.a;
        xgnVar.i = xfyVar;
        xgnVar.b |= 32768;
    }

    public final /* synthetic */ void e() {
        DesugarCollections.unmodifiableList(((xgn) this.a.b).c).getClass();
    }
}
