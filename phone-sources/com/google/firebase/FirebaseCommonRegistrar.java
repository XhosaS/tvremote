package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.uiv;
import defpackage.uiz;
import defpackage.uji;
import defpackage.ukf;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.ukq;
import defpackage.ulb;
import defpackage.ulk;
import defpackage.ums;
import defpackage.umt;
import defpackage.umv;
import defpackage.umw;
import defpackage.upr;
import defpackage.ups;
import defpackage.upt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<ukh<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        ukg ukgVarB = ukh.b(upt.class);
        final int i = 2;
        final int i2 = 0;
        ukgVarB.b(new ukq(upr.class, 2, 0));
        ukgVarB.c = new ulk(11);
        arrayList.add(ukgVarB.a());
        ulb ulbVar = new ulb(uji.class, Executor.class);
        final int i3 = 1;
        ukg ukgVar = new ukg(ums.class, umv.class, umw.class);
        ukgVar.b(new ukq(Context.class, 1, 0));
        ukgVar.b(new ukq(uiz.class, 1, 0));
        ukgVar.b(new ukq(umt.class, 2, 0));
        ukgVar.b(new ukq(upt.class, 1, 1));
        ukgVar.b(new ukq(ulbVar, 1, 0));
        ukgVar.c = new ukf(ulbVar, i);
        arrayList.add(ukgVar.a());
        arrayList.add(uiv.n("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(uiv.n("fire-core", "21.0.0_1p"));
        arrayList.add(uiv.n("device-name", a(Build.PRODUCT)));
        arrayList.add(uiv.n("device-model", a(Build.DEVICE)));
        arrayList.add(uiv.n("device-brand", a(Build.BRAND)));
        arrayList.add(uiv.o("android-target-sdk", new ups() { // from class: ujb
            @Override // defpackage.ups
            public final String a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i4 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 == 2) {
                    Context context = (Context) obj;
                    return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
                }
                Context context2 = (Context) obj;
                String installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        arrayList.add(uiv.o("android-min-sdk", new ups() { // from class: ujb
            @Override // defpackage.ups
            public final String a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i4 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 == 2) {
                    Context context = (Context) obj;
                    return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
                }
                Context context2 = (Context) obj;
                String installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        arrayList.add(uiv.o("android-platform", new ups() { // from class: ujb
            @Override // defpackage.ups
            public final String a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i4 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 == 2) {
                    Context context = (Context) obj;
                    return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
                }
                Context context2 = (Context) obj;
                String installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        final int i4 = 3;
        arrayList.add(uiv.o("android-installer", new ups() { // from class: ujb
            @Override // defpackage.ups
            public final String a(Object obj) {
                int i42 = i4;
                if (i42 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i42 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i42 == 2) {
                    Context context = (Context) obj;
                    return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
                }
                Context context2 = (Context) obj;
                String installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        return arrayList;
    }
}
