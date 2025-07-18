package defpackage;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tic implements pdk {
    public static final String a = aecz.d.e;
    public final thm b;
    private final tgu c;
    private final tiu d;
    private final thq e;
    private final Context f;
    private final Executor g;
    private final Set h;

    public tic(tgu tguVar, tiu tiuVar, thq thqVar, Context context, Executor executor, Set set, thm thmVar) {
        this.c = tguVar;
        this.d = tiuVar;
        this.e = thqVar;
        this.f = context;
        this.g = executor;
        this.h = set;
        this.b = thmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zyd i(Optional optional, final pbd pbdVar, final Set set) {
        pbdVar.getClass();
        zmx zmxVar = zmx.a;
        zmw zmwVar = new zmw();
        tiu tiuVar = this.d;
        zdm zdmVarListIterator = ((yxy) tiuVar.a).f().listIterator(0);
        if (zdmVarListIterator.hasNext()) {
            throw null;
        }
        Optional optionalA = tiuVar.b.a();
        MessageLite messageLiteA = pdg.a(pbdVar, tit.b);
        messageLiteA.getClass();
        tit titVar = (tit) messageLiteA;
        zoh zohVar = zoh.a;
        zog zogVar = new zog();
        if (!agvy.c(titVar, tit.a)) {
            tfu tfuVarB = tfu.b(titVar.c);
            if (tfuVarB == null) {
                tfuVarB = tfu.UNKNOWN;
            }
            tfuVarB.getClass();
            zob.b(tfuVarB, zogVar);
        }
        if (optionalA.isPresent()) {
            thv thvVar = thv.a;
            new thu();
            throw null;
        }
        zoh zohVarA = zob.a(zogVar);
        zof zofVar = ((zmx) zmwVar.b).i;
        if (zofVar == null) {
            zofVar = zof.a;
        }
        zoe zoeVar = new zoe();
        zoeVar.B(zofVar);
        if ((zoeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zoeVar.y();
        }
        zof zofVar2 = (zof) zoeVar.b;
        zofVar2.c = zohVarA;
        zofVar2.b |= 1;
        if ((zmwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zmwVar.y();
        }
        thq thqVar = this.e;
        zmx zmxVar2 = (zmx) zmwVar.b;
        zof zofVar3 = (zof) zoeVar.v();
        zofVar3.getClass();
        zmxVar2.i = zofVar3;
        zmxVar2.d |= 65536;
        abxd abxdVarV = zmwVar.v();
        abxdVarV.getClass();
        zyd zydVarB = thqVar.b((zmx) abxdVarV, this.c.a(optional));
        if (set.isEmpty()) {
            return zydVarB;
        }
        return zuz.h(zydVarB, wyo.c(new zvi() { // from class: tia
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final aeee aeeeVar = (aeee) obj;
                String str = ((pei) pdg.a(pbdVar, pej.a)).b;
                if (yqv.c(str)) {
                    str = tic.a;
                }
                thl thlVarA = this.a.b.a(set, str);
                zyd zydVarC = thlVarA.b.isEmpty() ? null : ahkr.c(thlVarA.a, 0, new thk(thlVarA, null), 3);
                if (zydVarC == null) {
                    return zxn.h(aeeeVar);
                }
                return zuz.g(zydVarC, wyo.a(new yqi() { // from class: thz
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        zox zoxVar = (zox) obj2;
                        String str2 = tic.a;
                        aeee aeeeVar2 = aeeeVar;
                        if (zoxVar == null) {
                            return aeeeVar2;
                        }
                        aeed aeedVar = new aeed();
                        aeedVar.B(aeeeVar2);
                        if ((aeedVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeedVar.y();
                        }
                        aeee aeeeVar3 = (aeee) aeedVar.b;
                        aeee aeeeVar4 = aeee.a;
                        aeeeVar3.g = zoxVar;
                        aeeeVar3.b |= 16384;
                        return (aeee) aeedVar.v();
                    }
                }), zwk.a);
            }
        }), this.g);
    }

    @Override // defpackage.pdk
    public final yqt a(pbd pbdVar) {
        if (pbdVar instanceof pdj) {
        }
        return yqt.i(zpf.NATIVE_VISUAL_ELEMENTS_LOG_EVENT);
    }

    @Override // defpackage.pdk
    public final /* synthetic */ yqt b(pbd pbdVar) {
        return ypv.a;
    }

    @Override // defpackage.pdk
    public final /* synthetic */ yqt c(pbd pbdVar) {
        return ypv.a;
    }

    @Override // defpackage.pdk
    public final zyd d(pbd pbdVar, zyd zydVar) {
        AccountId accountIdB = null;
        if (pbdVar instanceof pdf) {
            pcc pccVarA = ((pdf) pbdVar).a();
            abxc abxcVar = vfk.a;
            if (abxcVar.a != pcc.a) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object objK = pccVarA.n.k(abxcVar.d);
            vfj vfjVar = (vfj) (objK == null ? abxcVar.b : abxcVar.b(objK));
            if (!vfjVar.d && (vfjVar.b & 1) != 0) {
                accountIdB = AccountId.b(vfjVar.c);
            }
        }
        if (accountIdB == null) {
            return i(Optional.empty(), pbdVar, this.h);
        }
        tib tibVar = (tib) wgv.a(this.f, tib.class, accountIdB);
        return i(Optional.of(tibVar.b()), pbdVar, tibVar.r());
    }

    @Override // defpackage.pdk
    public final /* synthetic */ zyd e(pbd pbdVar, zyd zydVar) {
        return zxy.a;
    }

    @Override // defpackage.pdk
    public final /* synthetic */ aece f(pbd pbdVar) {
        return aece.DEFAULT;
    }

    @Override // defpackage.pdk
    public final String g(pbd pbdVar) {
        return a;
    }

    @Override // defpackage.pdk
    public final /* synthetic */ zyd h() {
        throw null;
    }
}
