package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjg extends ContextWrapper implements wip {
    private final yrp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjg(bq bqVar, Context context) {
        super(context);
        context.getClass();
        b(context, a(bqVar));
        this.a = yru.a(new yrp() { // from class: wjf
            @Override // defpackage.yrp
            public final Object eV() {
                wjg wjgVar = this.a;
                return ((LayoutInflater) wjgVar.getBaseContext().getSystemService("layout_inflater")).cloneInContext(wjgVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Locale a(bq bqVar) {
        Locale localeAM;
        if ((bqVar instanceof wjd) && (localeAM = ((wjd) bqVar).aM()) != null) {
            return localeAM;
        }
        bq bqVar2 = bqVar.F;
        if (bqVar2 != null) {
            return a(bqVar2);
        }
        return null;
    }

    private static void b(Context context, Locale locale) {
        if (locale != null) {
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return !"layout_inflater".equals(str) ? getBaseContext().getSystemService(str) : this.a.eV();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wjg(bq bqVar, final LayoutInflater layoutInflater) {
        Context context = layoutInflater.getContext();
        context.getClass();
        b(context, a(bqVar));
        super(context);
        this.a = yru.a(new yrp() { // from class: wje
            @Override // defpackage.yrp
            public final Object eV() {
                return layoutInflater.cloneInContext(this.a);
            }
        });
    }
}
