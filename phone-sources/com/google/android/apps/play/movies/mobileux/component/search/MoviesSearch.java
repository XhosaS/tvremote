package com.google.android.apps.play.movies.mobileux.component.search;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.search.PlaySearch;
import defpackage.tha;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MoviesSearch extends PlaySearch {
    public MoviesSearch(Context context) {
        this(context, null);
    }

    @Override // com.google.android.play.search.PlaySearch, defpackage.tgx
    public final void a(String str) {
        super.a(str);
        i();
    }

    @Override // com.google.android.play.search.PlaySearch, defpackage.tgx
    public final void b(tha thaVar) {
        super.b(thaVar);
        i();
    }

    public MoviesSearch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
