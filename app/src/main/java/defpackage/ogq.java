package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogq {
    private final FutureTask a;

    public ogq(final ngp ngpVar, final oco ocoVar, final oal oalVar) {
        this.a = new FutureTask(new Callable() { // from class: ogp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ogq.b(ngpVar, ocoVar, oalVar);
            }
        });
    }

    static /* synthetic */ CommandOuterClass$Command b(ngp ngpVar, oco ocoVar, oal oalVar) throws abxv {
        int[] iArrF = ngpVar.f();
        if (iArrF.length == 0) {
            return CommandOuterClass$Command.getDefaultInstance();
        }
        int i = iArrF[0];
        try {
            byte[] bArrE = ngpVar.e();
            try {
                abxd abxdVarH = abxd.h(CommandOuterClass$Command.a, bArrE, 0, bArrE.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null) {
                    abxd abxdVar = null;
                    byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                    if (bByteValue != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            if (true == zL) {
                                abxdVar = abxdVarH;
                            }
                            abxdVarH.cM(2, abxdVar);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                }
                return (CommandOuterClass$Command) abxdVarH;
            } catch (abxv unused) {
                acwg acwgVar = acwg.a;
                acvx acvxVar = new acvx();
                acsw acswVar = acsw.LOG_TYPE_WIRE_FORMAT_ERROR;
                if ((Integer.MIN_VALUE & acvxVar.b.memoizedSerializedSize) == 0) {
                    acvxVar.y();
                }
                acwg acwgVar2 = (acwg) acvxVar.b;
                acwgVar2.c = acswVar.E;
                acwgVar2.b = 2 | acwgVar2.b;
                acvxVar.a(i);
                ocoVar.c((acwg) acvxVar.v(), oalVar, "Command extension: invalid data.", new Object[0]);
                return CommandOuterClass$Command.getDefaultInstance();
            }
        } catch (IllegalStateException unused2) {
            acwg acwgVar3 = acwg.a;
            acvx acvxVar2 = new acvx();
            acsw acswVar2 = acsw.LOG_TYPE_INTERNAL_ERROR;
            if ((Integer.MIN_VALUE & acvxVar2.b.memoizedSerializedSize) == 0) {
                acvxVar2.y();
            }
            acwg acwgVar4 = (acwg) acvxVar2.b;
            acwgVar4.c = acswVar2.E;
            acwgVar4.b = 2 | acwgVar4.b;
            acvxVar2.a(i);
            ocoVar.c((acwg) acvxVar2.v(), oalVar, "Command extension: cannot serialize with extension number.", new Object[0]);
            return CommandOuterClass$Command.getDefaultInstance();
        } catch (UnsupportedOperationException unused3) {
            acwg acwgVar5 = acwg.a;
            acvx acvxVar3 = new acvx();
            acsw acswVar3 = acsw.LOG_TYPE_INTERNAL_ERROR;
            if ((Integer.MIN_VALUE & acvxVar3.b.memoizedSerializedSize) == 0) {
                acvxVar3.y();
            }
            acwg acwgVar6 = (acwg) acvxVar3.b;
            acwgVar6.c = acswVar3.E;
            acwgVar6.b = 2 | acwgVar6.b;
            acvxVar3.a(i);
            ocoVar.c((acwg) acvxVar3.v(), oalVar, "Command extension: invalid format.", new Object[0]);
            return CommandOuterClass$Command.getDefaultInstance();
        }
    }

    public final CommandOuterClass$Command a() {
        FutureTask futureTask = this.a;
        futureTask.run();
        try {
            return (CommandOuterClass$Command) futureTask.get();
        } catch (InterruptedException e) {
            throw new ocp("CommandFuture interrupted", e);
        } catch (ExecutionException e2) {
            throw new ocp("CommandFuture failed", e2);
        }
    }
}
