package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aapb {
    private static final Object a = new Object();
    private static aara b;

    public static lvf a(Context context, final Intent intent, boolean z) {
        aara aaraVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (a) {
            if (b == null) {
                b = new aara(context);
            }
            aaraVar = b;
        }
        if (!z) {
            return aaraVar.a(intent).a(new aaow(), new luj() { // from class: aaoz
                @Override // defpackage.luj
                public final Object a(lvf lvfVar) {
                    return -1;
                }
            });
        }
        if (aaqf.a().c(context)) {
            synchronized (aaqt.b) {
                aaqt.a(context);
                boolean zC = aaqt.c(intent);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!zC) {
                    aaqt.c.a(aaqt.a);
                }
                aaraVar.a(intent).l(lvm.a, new luu() { // from class: aaqs
                    @Override // defpackage.luu
                    public final void a(lvf lvfVar) {
                        aaqt.b(intent);
                    }
                });
            }
        } else {
            aaraVar.a(intent);
        }
        return lvq.c(-1);
    }

    public static final lvf b(final Intent intent, final Context context, Executor executor) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        final boolean z = (intent.getFlags() & 268435456) != 0;
        return (i < 26 || z) ? lvq.a(executor, new Callable() { // from class: aaox
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2;
                ComponentName componentNameStartService;
                aaqf aaqfVarA = aaqf.a();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                Intent intent2 = intent;
                Context context2 = context;
                aaqfVarA.c.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                String strB = aaqfVarA.b(context2, intent3);
                if (strB != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(strB));
                    }
                    intent3.setClassName(context2.getPackageName(), strB);
                }
                try {
                    if (aaqfVarA.c(context2)) {
                        synchronized (aaqt.b) {
                            aaqt.a(context2);
                            boolean zC = aaqt.c(intent3);
                            intent3.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                            componentNameStartService = context2.startService(intent3);
                            if (componentNameStartService == null) {
                                componentNameStartService = null;
                            } else if (!zC) {
                                aaqt.c.a(aaqt.a);
                            }
                        }
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    } else {
                        i2 = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e.toString()));
                    i2 = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).b(executor, new luj() { // from class: aaoy
            @Override // defpackage.luj
            public final Object a(lvf lvfVar) {
                if (((Integer) lvfVar.e()).intValue() != 402) {
                    return lvfVar;
                }
                boolean z2 = z;
                return aapb.a(context, intent, z2).a(new aaow(), new luj() { // from class: aapa
                    @Override // defpackage.luj
                    public final Object a(lvf lvfVar2) {
                        return 403;
                    }
                });
            }
        }) : a(context, intent, false);
    }
}
