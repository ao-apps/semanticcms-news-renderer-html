/*
 * semanticcms-news-renderer-html - SemanticCMS newsfeeds rendered as HTML in a Servlet environment.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-news-renderer-html.
 *
 * semanticcms-news-renderer-html is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-news-renderer-html is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-news-renderer-html.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.semanticcms.news.renderer.html {
	exports com.semanticcms.news.renderer.html;
	// Direct
	requires com.aoapps.html.any; // <groupId>com.aoapps</groupId><artifactId>ao-fluent-html-any</artifactId>
	requires com.aoapps.net.types; // <groupId>com.aoapps</groupId><artifactId>ao-net-types</artifactId>
	requires org.apache.commons.lang3; // <groupId>org.apache.commons</groupId><artifactId>commons-lang3</artifactId>
	requires javax.servlet.api; // <groupId>javax.servlet</groupId><artifactId>javax.servlet-api</artifactId>
	requires com.semanticcms.core.controller; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-controller</artifactId>
	requires com.semanticcms.core.model; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-model</artifactId>
	requires com.semanticcms.core.pages; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages</artifactId>
	requires com.semanticcms.core.pages.local; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-pages-local</artifactId>
	requires com.semanticcms.core.renderer.html; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-renderer-html</artifactId>
	requires com.semanticcms.news.model; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-model</artifactId>
	requires com.semanticcms.section.renderer.html; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-renderer-html</artifactId>
}
