package com.google.android.libraries.mediahome.providers.video.database;

import android.content.Context;
import defpackage.gex;
import defpackage.gez;
import defpackage.psl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class Database extends gex {
    private static volatile Database l;

    protected Database() {
    }

    public static Database y(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (l == null) {
            synchronized (Database.class) {
                if (l == null) {
                    l = (Database) gez.d(applicationContext, Database.class, "video-provider-db").a();
                }
            }
        }
        return l;
    }

    public abstract psl z();
}
