package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ebz;
import defpackage.eca;
import defpackage.efc;
import defpackage.fso;
import defpackage.fsp;
import defpackage.fto;
import defpackage.fus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public fsp a;
    public float b;
    public boolean c;
    public boolean d;
    private List e;
    private float f;
    private View g;
    private fso h;

    public SubtitleView(Context context) {
        this(context, null);
    }

    public final void a(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.e = list;
        b();
    }

    public final void b() {
        List arrayList;
        fso fsoVar = this.h;
        if (this.c && this.d) {
            arrayList = this.e;
        } else {
            arrayList = new ArrayList(this.e.size());
            for (int i = 0; i < this.e.size(); i++) {
                ebz ebzVar = new ebz((eca) this.e.get(i));
                if (!this.c) {
                    ebzVar.b();
                    CharSequence charSequence = ebzVar.a;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            ebzVar.e(SpannableString.valueOf(charSequence));
                        }
                        CharSequence charSequence2 = ebzVar.a;
                        charSequence2.getClass();
                        fus.n((Spannable) charSequence2, new efc(2));
                    }
                    fus.m(ebzVar);
                } else if (!this.d) {
                    fus.m(ebzVar);
                }
                arrayList.add(ebzVar.a());
            }
        }
        fsp fspVar = this.a;
        float f = this.b;
        float f2 = this.f;
        fsoVar.b = arrayList;
        fsoVar.d = fspVar;
        fsoVar.c = f;
        fsoVar.e = f2;
        while (true) {
            List list = fsoVar.a;
            if (list.size() >= arrayList.size()) {
                fsoVar.invalidate();
                return;
            }
            list.add(new fto(fsoVar.getContext()));
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = Collections.EMPTY_LIST;
        this.a = fsp.a;
        this.b = 0.0533f;
        this.f = 0.08f;
        this.c = true;
        this.d = true;
        fso fsoVar = new fso(context);
        this.h = fsoVar;
        this.g = fsoVar;
        addView(fsoVar);
    }
}
