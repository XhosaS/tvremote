package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bll extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ String[] c;
    final /* synthetic */ blp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bll(String[] strArr, blp blpVar, agsw agswVar) {
        super(2, agswVar);
        this.c = strArr;
        this.d = blpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bll) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        agtg agtgVar = agtg.a;
        if (this.b != 0) {
            obj2 = this.a;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            String[] strArr = this.c;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            objArrCopyOf.getClass();
            blp blpVar = this.d;
            Set setP = agqj.p(objArrCopyOf);
            this.a = setP;
            this.b = 1;
            if (blpVar.h.a(setP, this) == agtgVar) {
                return agtgVar;
            }
            obj2 = setP;
        }
        blp blpVar2 = this.d;
        obj2.getClass();
        blh blhVar = blpVar2.b;
        ReentrantLock reentrantLock = blhVar.e;
        reentrantLock.lock();
        try {
            List listX = agqq.x(blhVar.d.values());
            reentrantLock.unlock();
            Iterator it = listX.iterator();
            while (it.hasNext()) {
                ble bleVar = ((blw) it.next()).a;
            }
            return agpu.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bll(this.c, this.d, agswVar);
    }
}
