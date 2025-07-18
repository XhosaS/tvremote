package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vkv implements daw {
    final /* synthetic */ vkw a;

    public vkv(vkw vkwVar) {
        this.a = vkwVar;
    }

    @Override // defpackage.daw
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        davVar.b(BitmapFactory.decodeResource(this.a.a.getResources(), R.drawable.account_switcher_blue));
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }

    @Override // defpackage.daw
    public final void cz() {
    }

    @Override // defpackage.daw
    public final void d() {
    }
}
