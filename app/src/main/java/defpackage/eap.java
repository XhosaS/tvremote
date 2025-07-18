package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eap extends eas {
    private final ean b;
    private final ebu c;

    public eap(ean eanVar, ebu ebuVar) {
        super(ebl.a());
        this.b = eanVar;
        this.c = ebuVar;
    }

    @Override // defpackage.eah
    public final void c(ArrayList arrayList) {
        arrayList.add(this.b);
    }

    @Override // defpackage.eas
    protected final void m(dzb dzbVar) {
        ebp ebpVar = new ebp(this.c);
        ean eanVar = this.b;
        eao eaoVar = eanVar.a;
        ebg ebgVar = new ebg(dzbVar.a(eaoVar));
        ebg ebgVar2 = new ebg(eanVar.b);
        ebl eblVar = ((eas) this).a;
        eblVar.b(ebgVar, ebpVar, "initial");
        eblVar.b(ebgVar2, ebpVar, "end");
        eblVar.b(ebpVar, dzbVar.b(eaoVar), "default_input");
    }
}
