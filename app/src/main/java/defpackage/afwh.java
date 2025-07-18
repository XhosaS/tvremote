package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwh extends afhm {
    public final afhe f;
    public affe g = affe.IDLE;
    private afhj h;

    public afwh(afhe afheVar) {
        this.f = afheVar;
    }

    @Override // defpackage.afhm
    public final Status a(afhi afhiVar) {
        afwd afwdVar;
        Boolean bool;
        List list = afhiVar.a;
        if (list.isEmpty()) {
            Status statusWithDescription = Status.l.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + afhiVar.b.b.toString());
            b(statusWithDescription);
            return statusWithDescription;
        }
        Object obj = afhiVar.c;
        if ((obj instanceof afwd) && (bool = (afwdVar = (afwd) obj).a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Long l = afwdVar.b;
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        afhj afhjVar = this.h;
        if (afhjVar == null) {
            afhe afheVar = this.f;
            afgz afgzVar = new afgz();
            afgzVar.c(list);
            afhj afhjVarA = afheVar.a(afgzVar.a());
            afhjVarA.c(new afwc(this, afhjVarA));
            this.h = afhjVarA;
            e(affe.CONNECTING, new afwe(afhg.d(afhjVarA)));
            afhjVarA.a();
        } else {
            afhjVar.d(list);
        }
        return Status.OK;
    }

    @Override // defpackage.afhm
    public final void b(Status status) {
        afhj afhjVar = this.h;
        if (afhjVar != null) {
            afhjVar.b();
            this.h = null;
        }
        e(affe.TRANSIENT_FAILURE, new afwe(afhg.b(status)));
    }

    @Override // defpackage.afhm
    public final void c() {
        afhj afhjVar = this.h;
        if (afhjVar != null) {
            afhjVar.a();
        }
    }

    @Override // defpackage.afhm
    public final void d() {
        afhj afhjVar = this.h;
        if (afhjVar != null) {
            afhjVar.b();
        }
    }

    public final void e(affe affeVar, afhk afhkVar) {
        this.g = affeVar;
        this.f.e(affeVar, afhkVar);
    }
}
