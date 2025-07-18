package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.aahf;
import defpackage.aahy;
import defpackage.aaie;
import defpackage.aaif;
import defpackage.aaik;
import defpackage.aaiw;
import defpackage.aaji;
import defpackage.aajj;
import defpackage.aalt;
import defpackage.aalu;
import defpackage.aalw;
import defpackage.aalx;
import defpackage.aark;
import defpackage.aarm;
import defpackage.aarn;
import defpackage.aaro;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        aaie aaieVarB = aaif.b(aaro.class);
        aaieVarB.b(new aaiw(new aajj(aaji.class, aark.class), 2, 0));
        aaieVarB.c = new aaik() { // from class: aarh
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                Set setC = aaig.c(aaihVar, aark.class);
                aarj aarjVar = aarj.a;
                if (aarjVar == null) {
                    synchronized (aarj.class) {
                        aarjVar = aarj.a;
                        if (aarjVar == null) {
                            aarjVar = new aarj();
                            aarj.a = aarjVar;
                        }
                    }
                }
                return new aari(setC, aarjVar);
            }
        };
        arrayList.add(aaieVarB.a());
        final aajj aajjVar = new aajj(aahy.class, Executor.class);
        aaie aaieVar = new aaie(aalt.class, aalw.class, aalx.class);
        aaieVar.b(new aaiw(new aajj(aaji.class, Context.class), 1, 0));
        aaieVar.b(new aaiw(new aajj(aaji.class, aahf.class), 1, 0));
        aaieVar.b(new aaiw(new aajj(aaji.class, aalu.class), 2, 0));
        aaieVar.b(new aaiw(new aajj(aaji.class, aaro.class), 1, 1));
        aaieVar.b(new aaiw(aajjVar, 1, 0));
        aaieVar.c = new aaik() { // from class: aalr
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return new aalt((Context) aaihVar.e(Context.class), ((aahf) aaihVar.e(aahf.class)).c(), aaig.c(aaihVar, aalu.class), ((aajl) aaihVar).a(new aajj(aaji.class, aaro.class)), (Executor) aaihVar.d(aajjVar));
            }
        };
        arrayList.add(aaieVar.a());
        arrayList.add(aarn.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(aarn.a("fire-core", "21.0.0_1p"));
        arrayList.add(aarn.a("device-name", a(Build.PRODUCT)));
        arrayList.add(aarn.a("device-model", a(Build.DEVICE)));
        arrayList.add(aarn.a("device-brand", a(Build.BRAND)));
        arrayList.add(aarn.b("android-target-sdk", new aarm() { // from class: aahk
            @Override // defpackage.aarm
            public final String a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            }
        }));
        arrayList.add(aarn.b("android-min-sdk", new aarm() { // from class: aahl
            @Override // defpackage.aarm
            public final String a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
            }
        }));
        arrayList.add(aarn.b("android-platform", new aarm() { // from class: aahm
            @Override // defpackage.aarm
            public final String a(Object obj) {
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(aarn.b("android-installer", new aarm() { // from class: aahn
            @Override // defpackage.aarm
            public final String a(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        return arrayList;
    }
}
