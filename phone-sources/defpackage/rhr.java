package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhr extends LinearLayout {
    public rhr(Context context, byte[] bArr) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.choose_an_account_content, this);
        setOrientation(1);
    }

    public final rdz a(dvs dvsVar, qwn qwnVar, rhu rhuVar, int i) {
        Context context = getContext();
        if (dvsVar == null) {
            dvsVar = new dvv(ImmutableList.of());
        }
        dvs dvsVar2 = dvsVar;
        qwo qwoVar = qwnVar.b;
        rjg rjgVar = qwnVar.m;
        rfo rfoVar = qwnVar.e.j;
        return new rdz(context, qwoVar, dvsVar2, rhuVar, rjgVar, i);
    }

    public final rdz b(dvs dvsVar, qwn qwnVar, rhu rhuVar, int i) {
        Context context = getContext();
        if (dvsVar == null) {
            dvsVar = new dvv(ImmutableList.of());
        }
        dvs dvsVar2 = dvsVar;
        qwo qwoVar = qwnVar.b;
        rjg rjgVar = qwnVar.m;
        rfo rfoVar = qwnVar.e.j;
        return new rdz(context, qwoVar, dvsVar2, rhuVar, rjgVar, i);
    }

    public rhr(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.signed_out_content, this);
        setOrientation(1);
    }
}
