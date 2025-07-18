package defpackage;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ene implements ezz {
    @Override // defpackage.ezz
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        return Long.valueOf(edt.z(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
