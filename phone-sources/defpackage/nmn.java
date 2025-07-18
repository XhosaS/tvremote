package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nmn implements ont {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nmn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object, yoe] */
    @Override // defpackage.ont
    public final void a(onz onzVar) {
        nmj nmjVar;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((nmq) ((nnh) this.a).a).o(onzVar);
                return;
            case 1:
                boolean zI = onzVar.i();
                Object obj = this.a;
                if (!zI) {
                    ((lcz) obj).a.edit().putString("phenotype_experiment_token_key", "").apply();
                    return;
                }
                SharedPreferences.Editor editorEdit = ((lcz) obj).a.edit();
                oly olyVar = (oly) onzVar.e();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    try {
                        try {
                            dataOutputStream.writeInt(3);
                            dataOutputStream.writeUTF(olyVar.b);
                            oly.b(olyVar.c, dataOutputStream);
                            oly.a(olyVar.d, dataOutputStream);
                            oly.a(olyVar.e, dataOutputStream);
                            oly.a(olyVar.f, dataOutputStream);
                            oly.a(olyVar.g, dataOutputStream);
                            oly.c(olyVar.h, dataOutputStream);
                            oly.a(olyVar.i, dataOutputStream);
                            oly.c(olyVar.j, dataOutputStream);
                            oly.a(olyVar.k, dataOutputStream);
                            dataOutputStream.flush();
                            editorEdit.putString("phenotype_experiment_token_key", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)).apply();
                            return;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } finally {
                    dataOutputStream.close();
                }
            case 2:
                ((nmq) ((nnh) this.a).a).o(onzVar);
                return;
            case 3:
                boolean zI2 = onzVar.i();
                Object obj2 = this.a;
                if (zI2) {
                    Bundle bundle = (Bundle) onzVar.e();
                    boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    nsf.e();
                    if (z2) {
                        ((noo) obj2).g = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    }
                }
                noo nooVar = (noo) obj2;
                boolean z3 = nooVar.g;
                if (nooVar.b == null || (nmjVar = nooVar.c) == null) {
                    return;
                }
                boolean z4 = z3 && nmjVar.o;
                fva fvaVar = new fva();
                if (Build.VERSION.SDK_INT >= 30) {
                    fvaVar.b = z4;
                }
                boolean z5 = nmjVar.m;
                if (Build.VERSION.SDK_INT >= 30) {
                    fvaVar.d = z5;
                }
                boolean z6 = nmjVar.l;
                if (Build.VERSION.SDK_INT >= 30) {
                    fvaVar.c = z6;
                }
                boolean z7 = nmjVar.t;
                if (Build.VERSION.SDK_INT >= 30) {
                    fvaVar.e = z7;
                }
                fuy.p(new fvb(fvaVar));
                noo.a.a("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(nooVar.f), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6));
                noq noqVar = nooVar.e;
                if (noqVar != null) {
                    if (nooVar.f && z4) {
                        z = true;
                    }
                    noqVar.d = z;
                }
                if (nooVar.f && z4) {
                    nnx.e(uck.CAST_OUTPUT_SWITCHER_ENABLED);
                }
                if (z5) {
                    nnx.e(uck.CAST_TRANSFER_TO_LOCAL_ENABLED);
                    return;
                }
                return;
            case 4:
                ((CountDownLatch) this.a).countDown();
                return;
            case 5:
                aafi aafiVar = FirebaseInstanceId.h;
                ((CountDownLatch) this.a).countDown();
                return;
            case 6:
                uph.b((Intent) this.a);
                return;
            case 7:
                ((usr) this.a).e();
                return;
            case 8:
                this.a.cancel(false);
                return;
            default:
                Exception excD = onzVar.d();
                if (excD != null) {
                    this.a.resumeWith(ybn.e(excD));
                    return;
                } else if (((ooe) onzVar).c) {
                    this.a.e(null);
                    return;
                } else {
                    this.a.resumeWith(onzVar.e());
                    return;
                }
        }
    }

    public nmn(yoe yoeVar, int i) {
        this.b = i;
        this.a = yoeVar;
    }
}
