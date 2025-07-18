package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iul implements toe, duv {
    public static boolean a;
    public final Context b;
    public final itk c;
    public final yjv d;
    public final ith f;
    public final sqg h;
    public final iub i;
    public final iuh j;
    private boolean k;
    private final ListView l;
    private final iej m;
    private final iuk n;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final AtomicBoolean g = new AtomicBoolean(false);

    public /* synthetic */ iul(Context context, itk itkVar, yjv yjvVar) {
        dve lifecycle;
        iwu iwuVar;
        this.b = context;
        this.c = itkVar;
        this.d = yjvVar;
        this.f = itkVar.e();
        sqg sqgVar = new sqg(context, R.style.MediaDeviceBottomSheetDialogStyle);
        sqgVar.setContentView(R.layout.media_device_bottom_sheet);
        this.h = sqgVar;
        iub iubVar = new iub(context, itkVar, true);
        this.i = iubVar;
        View viewFindViewById = sqgVar.findViewById(R.id.device_list);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ListView listView = (ListView) viewFindViewById;
        this.l = listView;
        iej itmVar = new itm(this, 6);
        this.m = itmVar;
        iuk iukVar = new iuk(this, 0);
        this.n = iukVar;
        iuh iuhVar = new iuh(this, 2);
        this.j = iuhVar;
        krd.e("Initializing in targeted mode: false");
        ViewGroup viewGroup = (ViewGroup) sqgVar.getLayoutInflater().inflate(R.layout.media_device_list_header, (ViewGroup) listView, false);
        if (viewGroup != null) {
            listView.addHeaderView(viewGroup, null, false);
        }
        View viewInflate = sqgVar.getLayoutInflater().inflate(R.layout.media_device_list_footer, (ViewGroup) listView, false);
        viewInflate.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        ((TextView) viewGroup2.findViewById(R.id.device_list_helplink)).setText(Html.fromHtml(context.getResources().getString(R.string.media_device_footer_help, 0)));
        ((TextView) viewGroup2.findViewById(R.id.device_list_helplink)).setOnClickListener(new fsq(this, 7));
        listView.addFooterView(viewGroup2, null, false);
        listView.setAdapter((ListAdapter) iubVar);
        listView.setOnItemClickListener(new iuj(this, 0));
        itkVar.b().ea(itmVar);
        itkVar.g(iukVar);
        ith ithVarE = itkVar.e();
        if (ithVarE != null && (iwuVar = ((iua) ithVarE).j) != null) {
            iwuVar.a(iuhVar);
        }
        c();
        by byVarF = hju.F(context);
        if (byVarF == null || (lifecycle = byVarF.getLifecycle()) == null) {
            return;
        }
        lifecycle.c(this);
    }

    private final boolean i() {
        by byVarF;
        Context context = this.b;
        by byVarF2 = hju.F(context);
        return (byVarF2 == null || byVarF2.isDestroyed() || (byVarF = hju.F(context)) == null || byVarF.isFinishing()) ? false : true;
    }

    public final void a() {
        iwu iwuVar;
        iwr iwrVar;
        iwu iwuVar2;
        iwr iwrVar2;
        iwu iwuVar3;
        if (i()) {
            this.h.dismiss();
            this.e.removeCallbacksAndMessages(null);
            itk itkVar = this.c;
            ith ithVarE = itkVar.e();
            if (ithVarE != null && (iwuVar2 = ((iua) ithVarE).j) != null && (iwrVar2 = iwuVar2.e) != null && yks.e(iwrVar2.h(), true)) {
                try {
                    itkVar.b().ee(this.m);
                } catch (IllegalStateException unused) {
                }
                itk itkVar2 = this.c;
                itkVar2.j(this.n);
                ith ithVarE2 = itkVar2.e();
                if (ithVarE2 != null && (iwuVar3 = ((iua) ithVarE2).j) != null) {
                    iwuVar3.b(this.j);
                }
            }
            ith ithVarE3 = this.c.e();
            if (ithVarE3 == null || (iwuVar = ((iua) ithVarE3).j) == null || (iwrVar = iwuVar.e) == null || !yks.e(iwrVar.h(), true)) {
                this.k = true;
            }
        }
    }

    public final void b() {
        cr supportFragmentManager;
        by byVarF = hju.F(this.b);
        bv bvVarF = null;
        if (byVarF != null && (supportFragmentManager = byVarF.getSupportFragmentManager()) != null) {
            bvVarF = supportFragmentManager.f("AtvRemote.PairingFragment");
        }
        tof tofVar = (tof) bvVarF;
        if (tofVar != null) {
            tofVar.a();
        }
        a = false;
    }

    public final void c() {
        this.e.post(new gvj(this, this.c.f(), 9));
    }

    @Override // defpackage.toe
    public final void d() {
        this.c.h();
        b();
    }

    @Override // defpackage.duv
    public final void e(dvk dvkVar) {
        a();
    }

    @Override // defpackage.toe
    public final void g(String str) {
        iwu iwuVar;
        ith ithVarE = this.c.e();
        if (ithVarE != null && (iwuVar = ((iua) ithVarE).j) != null) {
            iwuVar.c(str);
        }
        b();
        if (this.k) {
            this.k = false;
        }
    }

    public final void h() {
        Window window;
        if (i()) {
            sqg sqgVar = this.h;
            sqgVar.show();
            Context context = this.b;
            by byVarF = hju.F(context);
            if (byVarF != null) {
                byVarF.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
                if (context.getResources().getConfiguration().orientation == 2 && (window = sqgVar.getWindow()) != null) {
                    window.setLayout((int) (r3.width() * 0.7d), -1);
                }
            }
            View viewFindViewById = sqgVar.findViewById(R.id.design_bottom_sheet);
            if (viewFindViewById != null) {
                viewFindViewById.post(new iuc(viewFindViewById, 3));
            }
        }
    }

    @Override // defpackage.duv
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void f(dvk dvkVar) {
    }
}
