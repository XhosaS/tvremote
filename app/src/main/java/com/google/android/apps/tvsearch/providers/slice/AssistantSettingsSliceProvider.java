package com.google.android.apps.tvsearch.providers.slice;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.slice.Slice;
import com.google.android.apps.tvsearch.providers.slice.AssistantSettingsSliceProvider;
import defpackage.aehg;
import defpackage.agow;
import defpackage.agqq;
import defpackage.agum;
import defpackage.agvy;
import defpackage.agyv;
import defpackage.brc;
import defpackage.brd;
import defpackage.gph;
import defpackage.hdq;
import defpackage.hef;
import defpackage.usc;
import defpackage.zdv;
import defpackage.zdy;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AssistantSettingsSliceProvider extends brd {
    public static final /* synthetic */ int a = 0;
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/providers/slice/AssistantSettingsSliceProvider");
    private static final UriMatcher c;
    private gph d;
    private agow e;
    private agow f;
    private agow g;
    private int h;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.google.android.katniss.sliceprovider.AssistantSettingsSliceProvider", "general/*", 1);
        uriMatcher.addURI("com.google.android.katniss.sliceprovider.AssistantSettingsSliceProvider", "searchable_apps/*", 2);
        uriMatcher.addURI("com.google.android.katniss.sliceprovider.AssistantSettingsSliceProvider", "broadcast", 3);
        uriMatcher.addURI("com.google.android.katniss.sliceprovider.AssistantSettingsSliceProvider", "farfield_mic/*", 4);
        c = uriMatcher;
    }

    private final void i(String str, agum agumVar) throws Exception {
        try {
            agumVar.a();
        } catch (Exception e) {
            int i = this.h;
            if (i == 0) {
                agvy.b("environment");
            } else if (i == 1) {
                throw e;
            }
            ((zdv) ((zdv) b.d()).p(e).q("com/google/android/apps/tvsearch/providers/slice/AssistantSettingsSliceProvider", "ensureCorrectThread", 146, "AssistantSettingsSliceProvider.kt")).x("%s was called from the wrong thread.", str);
        }
    }

    @Override // defpackage.brd
    public final Slice b(Uri uri) throws Exception {
        uri.getClass();
        i("#onBindSlice", new agum() { // from class: hdn
            @Override // defpackage.agum
            public final Object a() {
                int i = AssistantSettingsSliceProvider.a;
                uea.b();
                return agpu.a;
            }
        });
        return h(uri).a(uri);
    }

    @Override // defpackage.brd
    public final /* bridge */ /* synthetic */ Collection c(Uri uri) {
        uri.getClass();
        return agqq.d(hef.a, hef.b, hef.d);
    }

    @Override // defpackage.brd
    public final void e(Uri uri) throws Exception {
        uri.getClass();
        i("#onSlicePinned", new agum() { // from class: hdm
            @Override // defpackage.agum
            public final Object a() {
                int i = AssistantSettingsSliceProvider.a;
                uea.b();
                return agpu.a;
            }
        });
        h(uri).b(uri);
    }

    @Override // defpackage.brd
    public final void f(Uri uri) throws Exception {
        uri.getClass();
        i("#onSliceUnpinned", new agum() { // from class: hdp
            @Override // defpackage.agum
            public final Object a() {
                int i = AssistantSettingsSliceProvider.a;
                uea.b();
                return agpu.a;
            }
        });
        h(uri).c(uri);
    }

    @Override // defpackage.brd
    public final void g() throws Exception {
        Context context = getContext();
        if (context == null) {
            throw new IllegalStateException("SliceProvider AssistantSettingsSliceProvider not attached to a context.");
        }
        Object objA = aehg.a(context.getApplicationContext(), hdq.class);
        objA.getClass();
        hdq hdqVar = (hdq) objA;
        this.h = 2;
        this.d = hdqVar.bj();
        this.e = hdqVar.gS();
        this.f = hdqVar.gT();
        this.g = hdqVar.gU();
        i("#onCreateSliceProvider", new agum() { // from class: hdo
            @Override // defpackage.agum
            public final Object a() {
                int i = AssistantSettingsSliceProvider.a;
                uea.c();
                return agpu.a;
            }
        });
        gph gphVar = this.d;
        if (gphVar == null) {
            agvy.b("experience");
            gphVar = null;
        }
        if (gphVar == gph.a) {
            brc brcVar = new brc(context);
            brcVar.a(hef.a);
            brcVar.a(hef.b);
            brcVar.a(hef.c);
            brcVar.a(hef.d);
        }
    }

    public final usc h(Uri uri) {
        String string;
        String string2 = uri.toString();
        string2.getClass();
        int iU = agyv.u(string2, "/");
        if (iU != -1) {
            String string3 = uri.toString();
            string3.getClass();
            string = string3.substring(0, iU);
            string.getClass();
        } else {
            string = uri.toString();
            string.getClass();
        }
        ((zdv) b.b().q("com/google/android/apps/tvsearch/providers/slice/AssistantSettingsSliceProvider", "routeUriToProvider", 76, "AssistantSettingsSliceProvider.kt")).x("#routeUriToProvider(sliceUri = %s", string);
        int iMatch = c.match(uri);
        agow agowVar = null;
        if (iMatch == 1) {
            agow agowVar2 = this.g;
            if (agowVar2 == null) {
                agvy.b("sliceDataProviderSliceData");
            } else {
                agowVar = agowVar2;
            }
            Object objA = agowVar.a();
            objA.getClass();
            return (usc) objA;
        }
        if (iMatch == 2) {
            agow agowVar3 = this.f;
            if (agowVar3 == null) {
                agvy.b("sliceDataProviderSearchableAppsData");
            } else {
                agowVar = agowVar3;
            }
            Object objA2 = agowVar.a();
            objA2.getClass();
            return (usc) objA2;
        }
        if (iMatch != 3) {
            throw new IllegalArgumentException("Unsupported slice URI: ".concat(String.valueOf(string)));
        }
        agow agowVar4 = this.e;
        if (agowVar4 == null) {
            agvy.b("sliceDataProviderBroadcastData");
        } else {
            agowVar = agowVar4;
        }
        Object objA3 = agowVar.a();
        objA3.getClass();
        return (usc) objA3;
    }
}
