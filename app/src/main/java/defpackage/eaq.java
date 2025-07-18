package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eaq extends eas {
    private final int b;
    private final ean c;
    private final Interpolator d;

    public eaq(int i, ean eanVar, Interpolator interpolator) {
        super(ebl.a());
        this.b = i;
        this.c = eanVar;
        this.d = interpolator;
    }

    @Override // defpackage.eah
    public final void c(ArrayList arrayList) {
        arrayList.add(this.c);
    }

    @Override // defpackage.eas
    protected final void m(dzb dzbVar) {
        ebq ebqVar = new ebq(this.b);
        ean eanVar = this.c;
        eao eaoVar = eanVar.a;
        ebg ebgVar = new ebg(dzbVar.a(eaoVar));
        ebg ebgVar2 = new ebg(eanVar.b);
        ebn ebnVar = new ebn();
        Interpolator interpolator = this.d;
        if (interpolator != null) {
            ebm ebmVar = new ebm(interpolator);
            ebl eblVar = ((eas) this).a;
            eblVar.b(ebqVar, ebmVar, "default_input");
            eblVar.b(ebmVar, ebnVar, "default_input");
        } else {
            ((eas) this).a.b(ebqVar, ebnVar, "default_input");
        }
        ebl eblVar2 = ((eas) this).a;
        eblVar2.b(ebgVar, ebnVar, "initial");
        eblVar2.b(ebgVar2, ebnVar, "end");
        eblVar2.b(ebnVar, dzbVar.b(eaoVar), "default_input");
    }
}
