package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import j$.util.Objects;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nvb extends ogh {
    final /* synthetic */ nvc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvb(nvc nvcVar, Looper looper) {
        super(looper);
        this.a = nvcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        nvc nvcVar = this.a;
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new nun());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof nuo) {
                nvcVar.f = (nuo) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                nvcVar.e = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        if (Objects.equals(intent2.getAction(), "com.google.android.c2dm.intent.REGISTRATION")) {
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra != null) {
                Matcher matcher = nvc.b.matcher(stringExtra);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        nvcVar.c(strGroup, extras);
                        return;
                    }
                    return;
                }
                return;
            }
            String stringExtra2 = intent2.getStringExtra("error");
            if (stringExtra2 == null) {
                Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
                return;
            }
            if (!stringExtra2.startsWith("|")) {
                ko koVar = nvcVar.c;
                synchronized (koVar) {
                    for (int i = 0; i < koVar.d; i++) {
                        nvcVar.c((String) koVar.d(i), intent2.getExtras());
                    }
                }
                return;
            }
            String[] strArrSplit = stringExtra2.split("\\|");
            if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                return;
            }
            String str = strArrSplit[2];
            String strSubstring = strArrSplit[3];
            if (strSubstring.startsWith(":")) {
                strSubstring = strSubstring.substring(1);
            }
            nvcVar.c(str, intent2.putExtra("error", strSubstring).getExtras());
        }
    }
}
