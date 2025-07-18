package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.DownloadAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhl extends sca {
    public MaterialButton a;
    public ImageView b;
    public TextView c;
    public ComposeView d;
    public DownloadAnimationView e;

    public final ImageView a() {
        ImageView imageView = this.b;
        if (imageView != null) {
            return imageView;
        }
        yks.c("downloadIconImage");
        return null;
    }

    public final TextView b() {
        TextView textView = this.c;
        if (textView != null) {
            return textView;
        }
        yks.c("buttonText");
        return null;
    }

    public final ComposeView d() {
        ComposeView composeView = this.d;
        if (composeView != null) {
            return composeView;
        }
        yks.c("downloadProgressView");
        return null;
    }

    public final DownloadAnimationView e() {
        DownloadAnimationView downloadAnimationView = this.e;
        if (downloadAnimationView != null) {
            return downloadAnimationView;
        }
        yks.c("downloadIcon");
        return null;
    }

    public final MaterialButton f() {
        MaterialButton materialButton = this.a;
        if (materialButton != null) {
            return materialButton;
        }
        yks.c("button");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            p(R.id.download_button_layout);
            try {
                this.a = (MaterialButton) p(R.id.button);
                try {
                    this.b = (ImageView) p(R.id.download_icon_image);
                    try {
                        this.c = (TextView) p(R.id.download_button_text);
                        try {
                            this.d = (ComposeView) p(R.id.download_progress);
                            try {
                                this.e = (DownloadAnimationView) p(R.id.download_icon);
                            } catch (scr unused) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_icon", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
                            }
                        } catch (scr unused2) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_progress", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
                        }
                    } catch (scr unused3) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_button_text", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
                    }
                } catch (scr unused4) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_icon_image", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
                }
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
            }
        } catch (scr unused6) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "download_button_layout", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
        }
    }

    public final void i(wfo wfoVar, float f, bao baoVar, int i) {
        wfo wfoVar2;
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1994823745);
        if (i3 == 0) {
            wfoVar2 = wfoVar;
            i2 = i | (true != baoVarD.H(wfoVar2) ? 2 : 4);
        } else {
            wfoVar2 = wfoVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.C(f) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkm bkmVar = bkp.g;
            bkp bkpVarB = zi.b(zi.a(bkmVar, 1.0f), 56.0f);
            bkd bkdVar = bkb.a;
            bvt bvtVarA = xo.a(bkdVar, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarB);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            bkp bkpVarF = hq.f(zi.a(bkmVar, f).a(zi.b), bny.i(wfoVar2.q()), aep.a(28.0f));
            bvt bvtVarA2 = xo.a(bkdVar, false);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarF);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            baoVarD.o();
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new khq(this, wfoVar, f, i, 1);
        }
    }
}
