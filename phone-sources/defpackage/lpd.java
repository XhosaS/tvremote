package defpackage;

import android.content.Context;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpd implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final xcq f;

    public lpd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, xcq xcqVar6) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
        this.f = xcqVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        ImmutableList immutableList;
        Context contextA = ((rgq) this.a).a();
        osk oskVar = (osk) this.b.b();
        uqw uqwVar = (uqw) this.c.b();
        ura uraVar = (ura) this.d.b();
        lfn lfnVar = (lfn) this.e.b();
        loz lozVar = (loz) this.f.b();
        eik eikVar = new eik(16);
        ttp ttpVar = new ttp(Long.valueOf(TimeUnit.MINUTES.toMillis(30L)));
        long j = uqv.a;
        ugk ugkVar = ugk.a;
        if (ugkVar == null) {
            throw new NullPointerException("Null lightweightExecutor");
        }
        if (uqwVar == null) {
            throw new NullPointerException("Null transport");
        }
        if (oskVar == null) {
            throw new NullPointerException("Null clock");
        }
        uql uqlVar = new uql();
        uqlVar.a(true);
        uqlVar.a(lfnVar.cm());
        uqlVar.e = lfnVar.g();
        uqlVar.g = (byte) (uqlVar.g | 16);
        uqlVar.b = lfnVar.Y();
        uqlVar.g = (byte) (uqlVar.g | 2);
        uqlVar.c = TimeUnit.MILLISECONDS.toSeconds(lfnVar.aK());
        uqlVar.g = (byte) (uqlVar.g | 4);
        uqlVar.d = TimeUnit.MILLISECONDS.toSeconds(lfnVar.aM());
        uqlVar.g = (byte) (uqlVar.g | 8);
        ImmutableList immutableListOf = ImmutableList.of(xth.UNAVAILABLE);
        if (immutableListOf == null) {
            throw new NullPointerException("Null retryableStatusCodes");
        }
        uqlVar.f = immutableListOf;
        if (uqlVar.g != 31 || (immutableList = uqlVar.f) == null) {
            StringBuilder sb = new StringBuilder();
            if ((uqlVar.g & 1) == 0) {
                sb.append(" enabled");
            }
            if ((uqlVar.g & 2) == 0) {
                sb.append(" maxAttempts");
            }
            if ((uqlVar.g & 4) == 0) {
                sb.append(" initialBackoffSeconds");
            }
            if ((uqlVar.g & 8) == 0) {
                sb.append(" maxBackoffSeconds");
            }
            if ((uqlVar.g & 16) == 0) {
                sb.append(" backoffMultiplier");
            }
            if (uqlVar.f == null) {
                sb.append(" retryableStatusCodes");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        uqm uqmVar = new uqm(uqlVar.a, uqlVar.b, uqlVar.c, uqlVar.d, uqlVar.e, immutableList);
        int i = uqmVar.b;
        sij.y(i >= 2, "maxAttempts must be greater than or equal to 2. Was %s", i);
        double d = uqmVar.c;
        boolean z = d > 0.0d;
        Double dValueOf = Double.valueOf(d);
        sij.z(z, "Initial backoff seconds must be greater than 0. Was %s", dValueOf);
        double d2 = uqmVar.d;
        sij.A(d2 > d, "maxBackoffSeconds must be greater than initialBackoffSeconds. Were %s and %s, respectively", Double.valueOf(d2), dValueOf);
        double d3 = uqmVar.e;
        sij.z(d3 >= 1.0d, "backoffMultiplier must be greater than or equal to 1. Was %s", Double.valueOf(d3));
        sij.x(!uqmVar.f.isEmpty(), "retryableStatusCodes may not be empty.");
        rmp rmpVar = wzw.a;
        String str = wzw.a.a;
        if (str == null) {
            throw new NullPointerException("Null service");
        }
        uqn uqnVar = new uqn(str, uqmVar);
        sij.x(true, "Service name and method's service must match.");
        uqo uqoVar = new uqo(ImmutableSet.of(uqnVar));
        ImmutableSet immutableSet = uqoVar.a;
        ArrayListMultimap arrayListMultimapCreate = ArrayListMultimap.create();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            String str2 = ((uqn) it.next()).a;
            a.ab(!arrayListMultimapCreate.containsEntry(str2, null));
            arrayListMultimapCreate.put(str2, null);
        }
        lfnVar.getClass();
        uqh uqhVar = new uqh(contextA, oskVar, uqwVar, ugkVar, ugkVar, ugkVar, uraVar, lozVar, new eij(lfnVar, 15), new eij(lfnVar, 14), eikVar, ttpVar, uqoVar, j);
        sij.x(uqhVar.f == null || uqhVar.e != null, "If authContextManager is set, networkExecutor must be set.");
        return uqhVar;
    }
}
