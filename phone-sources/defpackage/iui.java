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
public final class iui implements toe, duv {
    public static boolean a;
    public final Context b;
    public final itk c;
    public final iuf d;
    public final yjv e;
    public final yjk f;
    public final ith g;
    public boolean h;
    public final sqg i;
    public final iub j;
    public final iuh k;
    private final yjk l;
    private final Handler m;
    private boolean n;
    private AtomicBoolean o;
    private final ListView p;
    private final iej q;
    private final iuk r;

    public iui(Context context, itk itkVar, iuf iufVar, yjv yjvVar, yjk yjkVar, yjk yjkVar2) {
        dve lifecycle;
        iwu iwuVar;
        ViewGroup viewGroup;
        itkVar.getClass();
        this.b = context;
        this.c = itkVar;
        this.d = iufVar;
        this.e = yjvVar;
        this.f = yjkVar;
        this.l = yjkVar2;
        this.m = new Handler(Looper.getMainLooper());
        this.g = itkVar.e();
        this.o = new AtomicBoolean(false);
        iug iugVar = new iug(this, context);
        iugVar.setContentView(R.layout.media_device_bottom_sheet);
        this.i = iugVar;
        int i = 1;
        iub iubVar = new iub(context, itkVar, iufVar == null);
        this.j = iubVar;
        View viewFindViewById = iugVar.findViewById(R.id.device_list);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ListView listView = (ListView) viewFindViewById;
        this.p = listView;
        iej itmVar = new itm(this, 5);
        this.q = itmVar;
        iuk iukVar = new iuk(this, 1);
        this.r = iukVar;
        iuh iuhVar = new iuh(this, 0);
        this.k = iuhVar;
        krd.e("Initializing in targeted mode: " + (iufVar != null));
        if (iufVar == null && (viewGroup = (ViewGroup) iugVar.getLayoutInflater().inflate(R.layout.media_device_list_header, (ViewGroup) listView, false)) != null) {
            listView.addHeaderView(viewGroup, null, false);
        }
        View viewInflate = iugVar.getLayoutInflater().inflate(R.layout.media_device_list_footer, (ViewGroup) listView, false);
        viewInflate.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        ((TextView) viewGroup2.findViewById(R.id.device_list_helplink)).setText(Html.fromHtml(context.getResources().getString(R.string.media_device_footer_help, 0)));
        ((TextView) viewGroup2.findViewById(R.id.device_list_helplink)).setOnClickListener(new fsq(this, 6));
        listView.addFooterView(viewGroup2, null, false);
        listView.setAdapter((ListAdapter) iubVar);
        listView.setOnItemClickListener(new iuj(this, i));
        itkVar.b().ea(itmVar);
        itkVar.g(iukVar);
        ith ithVarE = itkVar.e();
        if (ithVarE != null && (iwuVar = ((iua) ithVarE).j) != null) {
            iwuVar.a(iuhVar);
        }
        h();
        by byVarF = hju.F(context);
        if (byVarF == null || (lifecycle = byVarF.getLifecycle()) == null) {
            return;
        }
        lifecycle.c(this);
    }

    private final boolean m() {
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
        if (m()) {
            this.i.dismiss();
            this.m.removeCallbacksAndMessages(null);
            itk itkVar = this.c;
            ith ithVarE = itkVar.e();
            if (ithVarE != null && (iwuVar2 = ((iua) ithVarE).j) != null && (iwrVar2 = iwuVar2.e) != null && yks.e(iwrVar2.h(), true)) {
                try {
                    itkVar.b().ee(this.q);
                } catch (IllegalStateException unused) {
                }
                itk itkVar2 = this.c;
                itkVar2.j(this.r);
                ith ithVarE2 = itkVar2.e();
                if (ithVarE2 != null && (iwuVar3 = ((iua) ithVarE2).j) != null) {
                    iwuVar3.b(this.k);
                }
            }
            ith ithVarE3 = this.c.e();
            if (ithVarE3 == null || (iwuVar = ((iua) ithVarE3).j) == null || (iwrVar = iwuVar.e) == null || !yks.e(iwrVar.h(), true)) {
                this.n = true;
                return;
            }
            yjk yjkVar = this.l;
            if (yjkVar != null) {
                yjkVar.a();
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
        int i = 0;
        if (this.o.compareAndSet(false, true)) {
            Handler handler = this.m;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new iuc(this, i), 1000L);
        }
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
        if (this.n) {
            this.n = false;
            yjk yjkVar = this.l;
            if (yjkVar != null) {
                yjkVar.a();
            }
        }
    }

    public final void h() {
        this.m.post(new gvj(this, this.c.f(), 8));
    }

    public final void i() {
        Window window;
        if (m()) {
            sqg sqgVar = this.i;
            sqgVar.show();
            Context context = this.b;
            by byVarF = hju.F(context);
            int i = 2;
            if (byVarF != null) {
                byVarF.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
                if (context.getResources().getConfiguration().orientation == 2 && (window = sqgVar.getWindow()) != null) {
                    window.setLayout((int) (r4.width() * 0.7d), -1);
                }
            }
            View viewFindViewById = sqgVar.findViewById(R.id.design_bottom_sheet);
            if (viewFindViewById != null) {
                viewFindViewById.post(new iuc(viewFindViewById, i));
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

    public /* synthetic */ iui(Context context, itk itkVar, yjv yjvVar, yjk yjkVar, int i) {
        this(context, itkVar, null, (i & 8) != 0 ? new gwp(16) : yjvVar, (i & 16) != 0 ? null : yjkVar, null);
    }
}
