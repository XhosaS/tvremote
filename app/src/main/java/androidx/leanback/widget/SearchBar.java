package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.google.android.katniss.R;
import defpackage.azy;
import defpackage.azz;
import defpackage.baa;
import defpackage.bab;
import defpackage.bad;
import defpackage.bae;
import defpackage.baf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchBar extends RelativeLayout {
    public SearchEditText a;
    public SpeechOrbView b;
    public String c;
    public final Handler d;
    public boolean e;
    SoundPool f;
    SparseIntArray g;
    private String h;
    private final InputMethodManager i;
    private Drawable j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private int o;
    private int p;
    private final Context q;

    public SearchBar(Context context) {
        this(context, null);
    }

    private final void d() throws Resources.NotFoundException {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(null)) {
            string = this.b.isFocused() ? getResources().getString(R.string.lb_search_bar_hint_with_title_speech, null) : getResources().getString(R.string.lb_search_bar_hint_with_title, null);
        } else if (this.b.isFocused()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.h = string;
        SearchEditText searchEditText = this.a;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public final void a() {
        this.i.hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    }

    public final void b() {
        if (hasFocus()) {
            return;
        }
        requestFocus();
    }

    public final void c(boolean z) {
        if (z) {
            this.j.setAlpha(this.p);
            if (this.b.isFocused()) {
                SearchEditText searchEditText = this.a;
                int i = this.n;
                searchEditText.setTextColor(i);
                this.a.setHintTextColor(i);
            } else {
                this.a.setTextColor(this.l);
                this.a.setHintTextColor(this.n);
            }
        } else {
            this.j.setAlpha(this.o);
            this.a.setTextColor(this.k);
            this.a.setHintTextColor(this.m);
        }
        d();
    }

    public Drawable getBadgeDrawable() {
        return null;
    }

    public CharSequence getHint() {
        return this.h;
    }

    public String getTitle() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = new SoundPool(2, 1, 0);
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i = 0; i < 4; i++) {
            Context context = this.q;
            int i2 = iArr[i];
            this.g.put(i2, this.f.load(context, i2, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        this.j = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.a = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        this.a.setOnFocusChangeListener(new azy(this));
        this.a.addTextChangedListener(new baa(this, new azz(this)));
        SearchEditText searchEditText = this.a;
        searchEditText.a = new bab();
        searchEditText.setOnEditorActionListener(new bad(this));
        this.a.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.b = speechOrbView;
        speechOrbView.a = new bae(this);
        speechOrbView.setOnFocusChangeListener(new baf(this));
        c(hasFocus());
        d();
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i) {
        this.b.setNextFocusDownId(i);
        this.a.setNextFocusDownId(i);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Handler();
        this.e = false;
        this.g = new SparseIntArray();
        this.q = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.c = "";
        this.i = (InputMethodManager) context.getSystemService("input_method");
        this.l = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.k = resources.getColor(R.color.lb_search_bar_text);
        this.p = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.o = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.n = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.m = resources.getColor(R.color.lb_search_bar_hint);
    }
}
