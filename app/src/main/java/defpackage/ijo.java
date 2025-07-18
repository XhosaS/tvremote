package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijo extends axe {
    final /* synthetic */ ijp f;

    public ijo(ijp ijpVar) {
        this.f = ijpVar;
    }

    @Override // defpackage.axe
    public final int a() {
        return R.layout.setup_guidance_hotword;
    }

    @Override // defpackage.axe
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        layoutInflater.getClass();
        View viewB = super.b(layoutInflater, viewGroup, axdVar);
        viewB.getClass();
        iok iokVar = this.f.c;
        String str = iokVar.c;
        str.getClass();
        if (str.length() > 0) {
            Uri uri = Uri.parse(iokVar.c);
            ImageView imageView = (ImageView) viewB.findViewById(R.id.hotword_graphic);
            imageView.setImageURI(uri);
            imageView.setVisibility(0);
        }
        return viewB;
    }
}
