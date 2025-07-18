package defpackage;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.RowHeaderView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azu extends azm {
    public final Paint a;
    public boolean b;
    private final int c;
    private final boolean d;

    public azu() {
        throw null;
    }

    protected void b(azt aztVar) {
        if (this.d) {
            View view = aztVar.g;
            float f = aztVar.b;
            view.setAlpha(f + (aztVar.a * (1.0f - f)));
        }
    }

    @Override // defpackage.azm
    public azk q(ViewGroup viewGroup) {
        azt aztVar = new azt(LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false));
        if (this.d) {
            aztVar.a = 0.0f;
            b(aztVar);
        }
        return aztVar;
    }

    @Override // defpackage.azm
    public void s(azk azkVar, Object obj) {
        aye ayeVar = obj == null ? null : ((azr) obj).b;
        azt aztVar = (azt) azkVar;
        if (ayeVar == null) {
            RowHeaderView rowHeaderView = aztVar.c;
            if (rowHeaderView != null) {
                rowHeaderView.setText((CharSequence) null);
            }
            TextView textView = aztVar.d;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            View view = azkVar.g;
            view.setContentDescription(null);
            if (this.b) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        RowHeaderView rowHeaderView2 = aztVar.c;
        if (rowHeaderView2 != null) {
            rowHeaderView2.setText(ayeVar.a);
        }
        TextView textView2 = aztVar.d;
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            textView2.setText((CharSequence) null);
        }
        View view2 = azkVar.g;
        view2.setContentDescription(null);
        view2.setVisibility(0);
    }

    @Override // defpackage.azm
    public void u(azk azkVar) {
        azt aztVar = (azt) azkVar;
        RowHeaderView rowHeaderView = aztVar.c;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aztVar.d;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.d) {
            aztVar.a = 0.0f;
            b(aztVar);
        }
    }

    public azu(byte[] bArr) {
        this(R.layout.lb_row_header, true);
    }

    public azu(int i, boolean z) {
        this.a = new Paint(1);
        this.c = i;
        this.d = z;
    }
}
