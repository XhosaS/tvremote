package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhk implements uef {
    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws FileNotFoundException {
        ArrayDeque arrayDeque = new ArrayDeque();
        Uri uriBuild = ueeVar.e.buildUpon().fragment(null).build();
        ueg uegVar = ueeVar.a;
        zag.i(arrayDeque, uegVar.b(uriBuild));
        long jA = 0;
        while (!arrayDeque.isEmpty()) {
            Uri uri = (Uri) arrayDeque.remove();
            if (uegVar.i(uri)) {
                zag.i(arrayDeque, uegVar.b(uri));
            } else {
                if (!uegVar.h(uri)) {
                    throw new FileNotFoundException(String.format("Child %s could not be opened", uri));
                }
                jA += uegVar.a(uri);
            }
        }
        return Long.valueOf(jA);
    }
}
