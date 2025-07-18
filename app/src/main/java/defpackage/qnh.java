package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnh {
    private final qgw a;
    private final Context b;

    public qnh(qgw qgwVar, Context context) {
        this.a = qgwVar;
        this.b = context;
    }

    final zyd a(qng qngVar, String str, int i) {
        wzx wzxVarG = wzx.g(qngVar.a(this.a.a(new Account(str, "com.google")), new qgr(aewe.a.eV().a(this.b)), qln.a(i)));
        yqi yqiVar = new yqi() { // from class: qnb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return null;
            }
        };
        zwk zwkVar = zwk.a;
        wzx wzxVarH = wzxVarG.c(qgx.class, yqiVar, zwkVar).e(kej.class, new zvi() { // from class: qnc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                kej kejVar = (kej) obj;
                return kejVar.a.f == 17 ? zxn.g(new MdiNotAvailableException$ApiNotConnectedException()) : zxn.g(kejVar);
            }
        }, zwkVar).e(IOException.class, new zvi() { // from class: qnd
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                IOException iOException = (IOException) obj;
                kej kejVar = (kej) qjs.b(iOException, kej.class);
                return (kejVar == null || kejVar.a.f != 10) ? zxn.g(iOException) : zxn.g(new MdiNotAvailableException$DeveloperErrorException());
            }
        }, zwkVar).h(new yqi() { // from class: qne
            @Override // defpackage.yqi
            public final Object apply(Object obj) throws IOException {
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            }
        }, zwkVar);
        zxn.p(wzxVarH, wyo.f(new qnf()), zwkVar);
        return wzxVarH;
    }
}
