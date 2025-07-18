package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvf extends ConstraintLayout implements rji {
    public final MaterialButton j;
    public final MaterialButton k;
    public final MaterialButton l;
    public final ImageView m;
    public final ImageView n;
    public final ArrayList o;
    public ril p;
    public wds q;
    public cum r;
    public qvd s;
    public rhu t;
    public rjg u;

    public qvf(Context context) throws Resources.NotFoundException {
        super(context, null);
        this.o = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.policy_footer, this);
        this.j = (MaterialButton) findViewById(R.id.og_privacy_policy_button);
        this.k = (MaterialButton) findViewById(R.id.og_tos_button);
        this.l = (MaterialButton) findViewById(R.id.og_custom_button);
        this.m = (ImageView) findViewById(R.id.og_separator1);
        this.n = (ImageView) findViewById(R.id.og_separator2);
        getResources().getDimensionPixelSize(R.dimen.og_footer_added_separator_margin);
    }

    public static void f(MaterialButton materialButton) {
        materialButton.setMaxLines(3);
        materialButton.setEllipsize(null);
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        rjgVar.c(this.j, 90532);
        rjgVar.c(this.k, 90533);
        rjgVar.c(this.l, 90534);
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        rjgVar.e(this.j);
        rjgVar.e(this.k);
        rjgVar.e(this.l);
    }

    public final View.OnClickListener g(final qtg qtgVar, final int i) {
        rhz rhzVar = new rhz(new View.OnClickListener() { // from class: qvc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qvf qvfVar = this.a;
                ril rilVar = qvfVar.p;
                Object objA = qvfVar.r.a();
                wds wdsVar = qvfVar.q;
                vtw vtwVar = (vtw) wdsVar.a(5, null);
                vtwVar.x(wdsVar);
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                qtg qtgVar2 = qtgVar;
                int i2 = i;
                wds wdsVar2 = (wds) vtwVar.b;
                wds wdsVar3 = wds.a;
                wdsVar2.c = i2 - 1;
                wdsVar2.b |= 1;
                rilVar.a(objA, (wds) vtwVar.r());
                qvfVar.u.f(new ntp(5), view);
                qtgVar2.a(view, qvfVar.r.a());
            }
        });
        rhzVar.d = this.t.b();
        rhzVar.e = this.t.a();
        return new rhy(rhzVar);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Throwable {
        try {
            if (this.s != null) {
                while (true) {
                    ArrayList arrayList = this.o;
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                    if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                        break;
                    }
                    qvd qvdVar = (qvd) arrayList.remove(0);
                    this.s = qvdVar;
                    qvdVar.a(this);
                }
                qvd qvdVar2 = this.s;
                if (qvdVar2 != null) {
                    qvdVar2.a(this);
                }
            }
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            qvd qvdVar3 = this.s;
            if (qvdVar3 != null) {
                qvdVar3.a(this);
            }
            super.onMeasure(i, i2);
            throw th;
        }
    }
}
